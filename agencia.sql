CREATE DATABASE
Agencia;

use
Agencia;

CREATE TABLE Usuario (
idUsuario INT AUTO_INCREMENT PRIMARY KEY,
emailUsuario VARCHAR(100) NOT NULL,
cpfUsuario VARCHAR(11) UNIQUE NOT NULL,
telefone VARCHAR(15),
nomeUsuario VARCHAR(100) NOT NULL
);

CREATE TABLE   Pedido (
idPedido INT AUTO_INCREMENT PRIMARY KEY,
formapagar ENUM('Pix', 'Avista', 'Cartão', 'Boleto'),
valorPedido VARCHAR(10),
idUsuario INT NOT NULL,
idDestino INT NOT NULL,
FOREIGN KEY(idDestino) REFERENCES Destino (idDestino),
FOREIGN KEY(idUsuario) REFERENCES Usuario (idUsuario)
);

CREATE TABLE Destino (
idDestino INT AUTO_INCREMENT PRIMARY KEY,
nomeDestino VARCHAR(50) NOT NULL,
precoDestino VARCHAR(10) NOT NULL
);


INSERT INTO Usuario(nomeUsuario, cpfUsuario, emailUsuario, telefone) VALUES ('João', '12345675', 'joao123@gmail.com', '5678905432');

INSERT INTO Pedido(valorPedido, formapagar) VALUES ('1000.00', 'Pix');

INSERT INTO Destino(nomeDestino, precoDestino) VALUES ('São Paulo', '1000.00');

SELECT * FROM Destino;


