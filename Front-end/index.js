const express = require("express");

const app = express();

app.get("/form", (req, res) => {
  res.send("Hello World!");
});

app.listen(3000, () => console.log("Server started at: http://localhost:3000"));
