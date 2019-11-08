
const express = require('express');
const path = require('path');
const bodyParser = require("body-parser");
const app = express();
const nodemailer = require('nodemailer');





var transporter = nodemailer.createTransport({
    service: 'gmail',
    auth: {
      user: 'pms2019g3@gmail.com',
      pass: 'Pms-2019-G3!!'
    }
  });

app.use(bodyParser.urlencoded({ extended: false }));
app.use(bodyParser.json());


const port = process.env.PORT || 3000;


app.use(express.static('Public'));


app.post('/mail', function(req,res){
    let name = req.body.name;
    let email = req.body.email;
    let contacto = req.body.contacto;
    let data = req.body.data;
    let anos = req.body.exp;
    let area = req.body.funcao;
    let carta = req.body.message;
    console.log(name,email,contacto,data,anos,area,carta);

    
    var mailOptions = {
        from: 'pms2019g3@gmail.com',
        to: 'pms2019g3@gmail.com',
        subject: 'Nova Candidatura Espontânea',
        text: 'name: '+name+"\n email: "+email+"\n contacto: "+contacto+"\n data: "+data+"\n anos: "+ anos+"\n area: "+area+"\n carta: "+carta
    };
    transporter.sendMail(mailOptions, function(error, info){
        if (error) {
            console.log(error);
            res.end("Error?"+error);
        } else {
          console.log('Email sent: ' + info.response);
          res.end("success?"+info.response);
        }
      }); 
    
})

app.get('/', function(req, res){
    res.sendFile(__dirname + '\\Public\\index.html');
})

app.listen(port, function(){
    console.log("Listening on "+port);
})