
const express = require('express');
const path = require('path');
const app = express(),
    http = require('http').createServer(app).listen(process.env.PORT || 80);


app.use(express.static('Public'));
app.get('/', function(req, res){
    res.sendFile(__dirname + '\\Public\\index.html');
})

