---
title: "Classe System::Buffer"
linktitle: "Buffer"
second_title: "Aspose.Font pour C++"
description: "Classe System::Buffer. Contient des méthodes qui manipulent des tableaux d'octets bruts. Il s'agit d'un type statique sans services d'instance. Vous ne devez jamais créer d'instances de celui-ci par quelque moyen que ce soit en C++."
type: docs
weight: 1000
url: /fr/cpp/system/buffer/
---
## Buffer class


Contient des méthodes qui manipulent des tableaux d'octets bruts. Il s'agit d'un type statique sans services d'instance. Vous ne devez jamais créer d'instances de celui-ci par quelque moyen que ce soit.

```cpp
class Buffer
```

## Méthodes

| Méthode | Description |
| --- | --- |
| static [BlockCopy](./blockcopy/)(const uint8_t *, int, uint8_t *, int, int) | Copie un nombre spécifié d'octets du tampon source vers le tampon de destination. |
| static [BlockCopy](./blockcopy/)(const SharedPtr\<Array\<TSrc\>\>\&, int, const SharedPtr\<Array\<TDst\>\>\&, int, int) | Interprète deux tableaux typés spécifiés comme des tableaux bruts d'octets et copie les données de l'un à l'autre. |
| static [BlockCopy](./blockcopy/)(const System::Details::ArrayView\<TSrc\>\&, int, const System::Details::ArrayView\<TDst\>\&, int, int) | Interprète deux tableaux typés spécifiés comme des tableaux bruts d'octets et copie les données de l'un à l'autre. |
| static [BlockCopy](./blockcopy/)(const SharedPtr\<Array\<TSrc\>\>\&, int, const System::Details::ArrayView\<TDst\>\&, int, int) | Interprète deux tableaux typés spécifiés comme des tableaux bruts d'octets et copie les données de l'un à l'autre. |
| static [BlockCopy](./blockcopy/)(const System::Details::ArrayView\<TSrc\>\&, int, const SharedPtr\<Array\<TDst\>\>\&, int, int) | Interprète deux tableaux typés spécifiés comme des tableaux bruts d'octets et copie les données de l'un à l'autre. |
| static [BlockCopy](./blockcopy/)(const System::Details::StackArray\<TSrc, NS\>\&, int, const System::Details::StackArray\<TDst, ND\>\&, int, int) | Interprète deux tableaux typés spécifiés comme des tableaux bruts d'octets et copie les données de l'un à l'autre. |
| static [BlockCopy](./blockcopy/)(const SharedPtr\<Array\<TSrc\>\>\&, int, const System::Details::StackArray\<TDst, ND\>\&, int, int) | Interprète deux tableaux typés spécifiés comme des tableaux bruts d'octets et copie les données de l'un à l'autre. |
| static [BlockCopy](./blockcopy/)(const System::Details::StackArray\<TSrc, NS\>\&, int, const SharedPtr\<Array\<TDst\>\>\&, int, int) | Interprète deux tableaux typés spécifiés comme des tableaux bruts d'octets et copie les données de l'un à l'autre. |
| static [ByteLength](./bytelength/)(const SharedPtr\<Array\<T\>\>\&) | Détermine le nombre d'octets occupés par tous les éléments du tableau spécifié. |
| static [ByteLength](./bytelength/)(const System::Details::ArrayView\<T\>\&) | Détermine le nombre d'octets occupés par tous les éléments du tableau spécifié. |
| static [ByteLength](./bytelength/)(const System::Details::StackArray\<T, N\>\&) | Détermine le nombre d'octets occupés par tous les éléments du tableau spécifié. |
| static [GetByte](./getbyte/)(const SharedPtr\<Array\<T\>\>\&, int) | Interprète le tableau typé spécifié comme un tableau brut d'octets et récupère la valeur d'octet à l'offset d'octet spécifié. |
| static [GetByte](./getbyte/)(const System::Details::ArrayView\<T\>\&, int) | Interprète le tableau typé spécifié comme un tableau brut d'octets et récupère la valeur d'octet à l'offset d'octet spécifié. |
| static [GetByte](./getbyte/)(const System::Details::StackArray\<T, N\>\&, int) | Interprète le tableau typé spécifié comme un tableau brut d'octets et récupère la valeur d'octet à l'offset d'octet spécifié. |
| static [SetByte](./setbyte/)(const SharedPtr\<Array\<T\>\>\&, int, uint8_t) | Interprète le tableau typé spécifié comme un tableau brut d'octets et définit la valeur d'octet spécifiée à l'offset d'octet spécifié. |
| static [SetByte](./setbyte/)(const System::Details::ArrayView\<T\>\&, int, uint8_t) | Interprète le tableau typé spécifié comme un tableau brut d'octets et définit la valeur d'octet spécifiée à l'offset d'octet spécifié. |
| static [SetByte](./setbyte/)(const System::Details::StackArray\<T, N\>\&, int, uint8_t) | Interprète le tableau typé spécifié comme un tableau brut d'octets et définit la valeur d'octet spécifiée à l'offset d'octet spécifié. |
## Remarques



```cpp
#include <system/buffer.h>

using namespace System;

void Print(const SmartPtr<Array<uint8_t>> &source, int size)
{
  for (auto i = 0; i < size; i++)
  {
    std::cout << static_cast<int>(source[i]) << ' ';
  }
  std::cout << std::endl;
}

int main()
{
  // Crée et remplit le tableau.
  const int SIZE = 16;
  auto first = MakeObject<Array<uint8_t>>(SIZE);
  for (auto i = 0; i < SIZE; ++i)
  {
    first[i] = static_cast<uint8_t>(i * 2);
  }

  // Affiche les éléments du tableau.
  Print(first, SIZE);

  // Crée un tableau qui contient une partie du premier.
  auto second = MakeObject<Array<uint8_t>>(SIZE / 2);
  Buffer::BlockCopy(first, SIZE / 2, second, 0, SIZE / 2);

  // Affiche les éléments du deuxième tableau.
  Print(second, SIZE / 2);

  // Définit la valeur de l'élément à l'index 0 et affiche les éléments du tableau.
  Buffer::SetByte(second, 0, 128);
  Print(second, SIZE / 2);

  return 0;
}
/*
This code example produces the following output:
0 2 4 6 8 10 12 14 16 18 20 22 24 26 28 30
16 18 20 22 24 26 28 30
128 18 20 22 24 26 28 30
*/
```

## Voir aussi

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
