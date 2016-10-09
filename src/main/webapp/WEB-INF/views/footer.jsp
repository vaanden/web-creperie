<%-- 
    Document   : footer
    Created on : 13 déc. 2014, 19:56:08
    Author     : Yoni
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<link rel="stylesheet" href="css/footer.css" />
<div>
    <div id="footer_main_div">
        <section id="a_propos">
            <h3 class='ss_titre'>&Agrave; propos</h3> 
            <ul>
                <li><a class="nav_link" onclick="redirect('info_1')">Qu'est-ce que ReviewsProject?</a></li>
                <li><a class="nav_link" onclick="redirect('info_2')">Qui sommes-nous?</a></li>
                <li><a class="nav_link" onclick="redirect('info_3')">Nos partenaires</a></li>
                <li><a class="nav_link" onclick="redirect('info_4')">Aide</a></li>
            </ul>
        </section>
        <section id="contact">
            <h3 class='ss_titre'>Contact</h3> 
            <ul>
                <li><a class="nav_link" onclick="redirect('contact_1')">Mentions légales</a></li>
                <li><a class="nav_link" onclick="redirect('contact_2')">Conditions Générales d'Utilisation</a></li>
                <li><a class="nav_link" onclick="redirect('contact_3')">Contact</a></li>
                <li><a class="nav_link" onclick="redirect('contact_4')">FAQ</a></li>
            </ul>
        </section>
        <!--<div style="text-align: center"><img src="css/images/logo.PNG"></div>-->
    </div>
</div>
