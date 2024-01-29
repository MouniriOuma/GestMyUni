<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 27/01/2024
  Time: 02:25
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.*"%>
<%@page import="com.uni.dream.Batiment.Batiment"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <link
            href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
            rel="stylesheet"
            integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
            crossorigin="anonymous">
    <title>Insert title here</title>
</head>
<body>
<h2 class='container  mb-5'>
    Bonjour
    <%=session.getAttribute("nom")%>
    <a href='Deconnecter'>Deconnection</a>
</h2>
<section class='container shadow-lg p-3 rounded'>
    <h2>Les baatiments</h2>
    <table class='table'>
        <thead class='table-dark'>
        <tr>
            <th>description</th>
            <th>emplacement</th>
            <th>taille</th>
            <th>fonctionalite</th>
            <th>genre</th>
            <th>Action</th>
        </tr>
        </thead>
        <tbody>
        <%
            ArrayList<Batiment> batiments = (ArrayList<Batiment>) request.getAttribute("Batiments");
            double total = 0;
            String str = "";
            if (batiments != null) {
                for (Batiment batimentInfo : batiments) {
        %>
        <tr>
            <td><%=batimentInfo.getIdBatiment()%></td>

            <td><%=batimentInfo.getDescription()%></td>
            <td>
                <%=batimentInfo.getTaille()%>
            </td>
            <td><%=batimentInfo.getFonctionnalite()%></td>
            <td><%=batimentInfo.getGenre()%></td>

            <form action='batiment' method='post'>
                <input type='hidden' value='<%=batimentInfo.getIdBatiment()%>' name='index_mod' />
                <button class='btn btn-outline-info' type="submit" name="act_upd">Modifier</button>
            </form>
            <form action='batiment' method='post'
                  onSubmit="return confirm('Do you really wanna delete this batiment?')">
                <input type='hidden' value='<%=batimentInfo.getIdBatiment()%>' name='index_del' />
                <button class='btn btn-outline-danger' type="submit"
                        name="act_del">Supprimer</button>
            </form>
            </td>
        </tr>
        <%
                }
            }
        %>
        <tr>
            <td colspan='5' align='right'>Total
            </td>
            <td></td>
        </tr>
        </tbody>
    </table>
</section>

<%!
    public String getForm(Batiment a) {
        int indice = a != null ? a.getIdBatiment() : -1;
        boolean isUpdate = indice > 0;
        String selectedEmplacement = isUpdate ? a.getEmplacement() : "";
        String frm = "<section class='container mt-3 shadow-lg p-3 rounded'>";
        frm += "<form method='post' action='batiment'> <h1>"+(isUpdate)+"</h1>";
        frm += "<table><h3>Ajouter une batiment</h3>";
        frm += "<tr><td>description :</td>";
        frm += "<td><textarea  style='margin-bottom:10px' required class='form-control' name='description'  type='text' value='"
                + (isUpdate ? a.getDescription() : "") + "' > "+ (isUpdate ? a.getDescription() : "")+ "</textarea></td>";
        frm += "</tr><tr><td>Taille :</td>";
        frm += "<td><input style='margin-bottom:10px' required class='form-control' name='taille' type='number' value='"
                + (isUpdate ? a.getTaille() : "") + "' /></td>";
        frm += "</tr><tr><td>fonctionalite :</td> <td><input type='text'  style='margin-bottom:10px' required class='form-control' name='fonctionalite'/></td>";
        frm += "</tr><tr><td>genre :</td><td>" +
                " <select class='form-control' id='exampleFormControlSelect1' name='genre' value='"+ (isUpdate ? a.getEmplacement() : "")+"'>" +
                "      <option  >Classe</option>'" +
                "      <option>administration</option>'" +
                "      <option>sport</option>'" +
                "      <option>Batiment Administration</option>'" +
                "      <option>Batiment des bureaux</option>" +
                "    </select></td></tr>";
        frm +="<tr><td>Emplacement: </td><td>" +
                "    <select multiple class='form-control' name='emplacement' value='"+ (isUpdate ? a.getEmplacement() : "")+"'>" +
                "      <option>1</option>" +
                "      <option>2</option>" +
                "      <option>3</option>" +
                "      <option>4</option>" +
                "      <option>5</option>" +
                "    </select>" +
                "</td></tr>";
        frm += "<tr><td><input type='hidden' value='" + (isUpdate ? indice : "") + "' name='index_upd'/>";
        frm += "<button style='width:150px; margin-top:12px' class='btn btn-warning me-2' name='act_save' type='submit'>Enregistrer</button>";
        frm += "<button style='width:150px; margin-top:12px' class='btn btn-secondary' type='reset' name='act_reset'>Annuler</button>";
        frm += "</td></tr></table></form></section>";
        return frm;
    }%>

<%
    Batiment a = request.getAttribute("batiment_update") != null ? (Batiment) request.getAttribute("batiment_update"): null;
    //out.print(getForm(a));
%>

</body>
</html>
