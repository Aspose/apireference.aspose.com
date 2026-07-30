---
title: "classe System::BitConverter"
linktitle: "BitConverter"
second_title: "Aspose.Font pour C++"
description: "classe System::BitConverter. Contient des méthodes qui effectuent des conversions d'une séquence d'octets vers un type valeur et vice-versa. Il s'agit d'un type statique sans services d'instance. Vous ne devez jamais créer d'instances de celui-ci par quelque moyen que ce soit en C++."
type: docs
weight: 500
url: /fr/cpp/system/bitconverter/
---
## BitConverter class


Contient des méthodes qui effectuent des conversions d'une séquence d'octets vers un type valeur et vice-versa. Il s'agit d'un type statique sans services d'instance. Vous ne devez jamais créer d'instances de celui-ci par quelque moyen que ce soit.

```cpp
class BitConverter
```

## Méthodes

| Méthode | Description |
| --- | --- |
| static [_IsLittleEndian](./_islittleendian/)() | Indique l'endianité de l'architecture actuelle. |
| static [DoubleToInt64Bits](./doubletoint64bits/)(double) | Renvoie une valeur entière de 64 bits dont la représentation binaire est égale à la représentation binaire de la valeur en virgule flottante double précision spécifiée. |
| static [GetBytes](./getbytes/)(bool) | Convertit la valeur booléenne spécifiée en un tableau d'octets. |
| static [GetBytes](./getbytes/)(char_t) | Convertit la valeur char_t spécifiée en un tableau d'octets. |
| static [GetBytes](./getbytes/)(int16_t) | Convertit la valeur entière de 16 bits spécifiée en un tableau d'octets. |
| static [GetBytes](./getbytes/)(int) | Convertit la valeur entière de 32 bits spécifiée en un tableau d'octets. |
| static [GetBytes](./getbytes/)(int64_t) | Convertit la valeur entière de 64 bits spécifiée en un tableau d'octets. |
| static [GetBytes](./getbytes/)(uint16_t) | Convertit la valeur entière non signée de 16 bits spécifiée en un tableau d'octets. |
| static [GetBytes](./getbytes/)(uint32_t) | Convertit la valeur entière non signée de 32 bits spécifiée en un tableau d'octets. |
| static [GetBytes](./getbytes/)(uint64_t) | Convertit la valeur entière non signée de 64 bits spécifiée en un tableau d'octets. |
| static [GetBytes](./getbytes/)(float) | Convertit la valeur en virgule flottante simple précision spécifiée en un tableau d'octets. |
| static [GetBytes](./getbytes/)(double) | Convertit la valeur en virgule flottante double précision spécifiée en un tableau d'octets. |
| static [Int64BitsToDouble](./int64bitstodouble/)(int64_t) | Renvoie une valeur en virgule flottante double précision dont la valeur est équivalente à la valeur. |
| static [ToBoolean](./toboolean/)(const System::ArrayPtr\<uint8_t\>\&, int) | Convertit un octet du tableau spécifié à partir de l'index spécifié en valeur booléenne. |
| static [ToBoolean](./toboolean/)(const System::Details::ArrayView\<uint8_t\>\&, int) | Convertit un octet du tableau spécifié à partir de l'index spécifié en valeur booléenne. |
| static [ToChar](./tochar/)(const System::ArrayPtr\<uint8_t\>\&, int) | Convertit deux octets du tableau spécifié à partir de l'index spécifié en valeur char_t. |
| static [ToChar](./tochar/)(const System::Details::ArrayView\<uint8_t\>\&, int) | Convertit deux octets du tableau spécifié à partir de l'index spécifié en valeur char_t. |
| static [ToDouble](./todouble/)(const System::ArrayPtr\<uint8_t\>\&, int) | Convertit huit octets du tableau spécifié à partir de l'index spécifié en valeur en virgule flottante double précision. |
| static [ToDouble](./todouble/)(const System::Details::ArrayView\<uint8_t\>\&, int) | Convertit huit octets du tableau spécifié à partir de l'index spécifié en valeur en virgule flottante double précision. |
| static [ToInt16](./toint16/)(const System::ArrayPtr\<uint8_t\>\&, int) | Convertit deux octets du tableau spécifié à partir de l'index spécifié en valeur entière de 16 bits. |
| static [ToInt16](./toint16/)(const System::Details::ArrayView\<uint8_t\>\&, int) | Convertit deux octets du tableau spécifié à partir de l'index spécifié en valeur entière de 16 bits. |
| static [ToInt32](./toint32/)(const System::ArrayPtr\<uint8_t\>\&, int) | Convertit quatre octets du tableau spécifié à partir de l'index spécifié en valeur entière de 32 bits. |
| static [ToInt32](./toint32/)(const System::Details::ArrayView\<uint8_t\>\&, int) | Convertit quatre octets du tableau spécifié à partir de l'index spécifié en valeur entière de 32 bits. |
| static [ToInt64](./toint64/)(const System::ArrayPtr\<uint8_t\>\&, int) | Convertit huit octets du tableau spécifié à partir de l'index spécifié en valeur entière de 64 bits. |
| static [ToInt64](./toint64/)(const System::Details::ArrayView\<uint8_t\>\&, int) | Convertit huit octets du tableau spécifié à partir de l'index spécifié en valeur entière de 64 bits. |
| static [ToSingle](./tosingle/)(const System::ArrayPtr\<uint8_t\>\&, int) | Convertit quatre octets du tableau spécifié à partir de l'index spécifié en valeur en virgule flottante simple précision. |
| static [ToSingle](./tosingle/)(const System::Details::ArrayView\<uint8_t\>\&, int) | Convertit quatre octets du tableau spécifié à partir de l'index spécifié en valeur en virgule flottante simple précision. |
| static [ToString](./tostring/)(const ArrayPtr\<uint8_t\>\&, bool, const String\&) | Convertit toutes les valeurs du tableau d'octets spécifié en leur représentation sous forme de chaîne hexadécimale. La casse des lettres à utiliser dans la notation hexadécimale et le séparateur inséré entre chaque paire d'octets voisins sont spécifiés via les arguments correspondants. |
| static [ToString](./tostring/)(const ArrayPtr\<uint8_t\>\&, int) | Convertit les valeurs du tableau d'octets spécifié en leur représentation sous forme de chaîne hexadécimale à partir de l'index spécifié. |
| static [ToString](./tostring/)(const ArrayPtr\<uint8_t\>\&, int, int) | Convertit une plage de valeurs du tableau d'octets spécifié en leur représentation sous forme de chaîne hexadécimale. |
| static [ToUInt16](./touint16/)(const System::ArrayPtr\<uint8_t\>\&, int) | Convertit deux octets du tableau spécifié à partir de l'index spécifié en valeur entière non signée de 16 bits. |
| static [ToUInt16](./touint16/)(const System::Details::ArrayView\<uint8_t\>\&, int) | Convertit deux octets du tableau spécifié à partir de l'index spécifié en valeur entière non signée de 16 bits. |
| static [ToUInt32](./touint32/)(const System::ArrayPtr\<uint8_t\>\&, int) | Convertit quatre octets du tableau spécifié à partir de l'index spécifié en valeur entière non signée de 32 bits. |
| static [ToUInt32](./touint32/)(const System::Details::ArrayView\<uint8_t\>\&, int) | Convertit quatre octets du tableau spécifié à partir de l'index spécifié en valeur entière non signée de 32 bits. |
| static [ToUInt64](./touint64/)(const System::ArrayPtr\<uint8_t\>\&, int) | Convertit huit octets du tableau spécifié à partir de l'index indiqué en une valeur entière non signée de 64 bits. |
| static [ToUInt64](./touint64/)(const System::Details::ArrayView\<uint8_t\>\&, int) | Convertit huit octets du tableau spécifié à partir de l'index indiqué en une valeur entière non signée de 64 bits. |
## Champs

| Champ | Description |
| --- | --- |
| static [IsLittleEndian](./islittleendian/) | Indique le type d'endianité de l'architecture actuelle. true si l'architecture est little endian, false sinon. |
## Remarques



```cpp
#include <system/bit_converter.h>
#include <system/smart_ptr.h>

using namespace System;

template <typename T>
void Print(T arg)
{
  std::cout << arg << ' ';

  for (const auto byte: BitConverter::GetBytes(arg))
  {
    std::cout << std::hex << static_cast<int>(byte);
  }

  std::cout << std::endl;
}

int main()
{
  // Créer des valeurs à imprimer.
  int anInt = 1234567890;
  double aDouble = 0.123456789;

  // Imprimer la valeur et ses octets.
  Print(anInt);
  Print(aDouble);

  return 0;
}
/*
This code example produces the following output:
1234567890 d229649
0.123457 5f633937dd9abf3f
*/
```

## Voir aussi

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
