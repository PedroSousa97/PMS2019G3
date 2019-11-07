<?php
    $Nome = $_POST['name'];                 /*Definição dos diferentes dados do formulários*/
    $Email = $_POST['email'];
    $Contacto = $_POST['contacto'];
    $Data = $_POST['data'];
    $Anos = $_POST['exp'];
    $Área = $_POST['função'];
    $Carta = $_POST['message'];


    $email_from = 'henrique_807@hotmail.com';     /*email que irá enviar os dados*/
    $email_subject = 'Nova Candidatura Espontânea';   /*Assunto dos emails enviados por formulário*/

    $email_body = "Nome: $Nome.\n".                                   /*Conteudo do email*/
                    "Email: $Email.\n".
                        "Contacto: $Contacto.\n".
                            "Data de Nascimento: $Data.\n".
                                "Anos de Experiência: $Anos.\n".
                                 "Área a que se candidata: $Área.\n".
                                  "Carta de Motivação: $Carta.\n";

    $to = 'henriquesantos293@gmail.com';               /*Email que irá receber*/

    $headers = "From: $email_from \r\n";
    $headers .= "Reply to: $Email \r\n";

    mail($to,$email_subject,$email_body,$headers);

    header("Location: index.html");
?>