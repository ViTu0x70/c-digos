// See https://aka.ms/new-console-template for more information
using System.Numerics;

string frase = Console.ReadLine();
string x = Console.ReadLine();
string y = Console.ReadLine();
string z = Console.ReadLine();

string s = Console.ReadLine();
string[] vetor = s.Split(' '); //split deixa um espaço entrer o que for incerido no vetor
string a = vetor[0];
string b = vetor[1];  
string c = vetor[2];

Console.WriteLine("você digitou: " + frase + ", " + x + ", "+ y +", "+ z);
Console.WriteLine("você digitou: " + a + ", " + b + ", " + c);