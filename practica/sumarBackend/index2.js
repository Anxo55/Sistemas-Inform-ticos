let express = require("express") 

let app = express()

function saludar(req, res) {
    res.send("hola soy el backend del profe")
}
//http://127.0.0.1:3000/hola
//http://localhost:3000/hola
//(profe) http://10.101.17.22:3000/hola

app.get("/", saludar)

app.listen(3000)