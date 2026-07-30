---
title: "System::BitConverter::ToString méthode"
linktitle: "ToString"
second_title: "Aspose.Font pour C++"
description: "System::BitConverter::ToString méthode. Convertit toutes les valeurs du tableau d'octets spécifié en leur représentation sous forme de chaîne hexadécimale. La casse des lettres à utiliser dans la notation hexadécimale et le séparateur inséré entre chaque paire d'octets voisins sont spécifiés via les arguments correspondants en C++."
type: docs
weight: 1200
url: /fr/cpp/system/bitconverter/tostring/
---
## BitConverter::ToString(const ArrayPtr\<uint8_t\>\&, bool, const String\&) method


Convertit toutes les valeurs du tableau d'octets spécifié en leur représentation sous forme de chaîne hexadécimale. La casse des lettres à utiliser dans la notation hexadécimale et le séparateur inséré entre chaque paire d'octets voisins sont spécifiés via les arguments correspondants.

```cpp
static String System::BitConverter::ToString(const ArrayPtr<uint8_t> &value, bool uppercase=true, const String &separator=u"-")
```


| Paramètre | Type | Description |
| --- | --- | --- |
| value | const ArrayPtr\<uint8_t\>\& | [Array](../../array/) qui contient les octets à convertir |
| majuscules | bool | Spécifie la casse des lettres à utiliser dans la représentation hexadécimale résultante |
| séparateur | const String\& | Une chaîne utilisée comme séparateur inséré entre chaque paire d'octets voisins dans la chaîne résultante |

### ReturnValue

[String](../../string/) containing hexadecimal representation of the specified byte array

## Voir aussi

* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Class [BitConverter](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## BitConverter::ToString(const ArrayPtr\<uint8_t\>\&, int) method


Convertit les valeurs du tableau d'octets spécifié en leur représentation sous forme de chaîne hexadécimale à partir de l'index spécifié.

```cpp
static String System::BitConverter::ToString(const ArrayPtr<uint8_t> &value, int startIndex)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| value | const ArrayPtr\<uint8_t\>\& | [Array](../../array/) qui contient les octets à convertir |
| startIndex | int | Index dans le tableau spécifié à partir duquel commencer la conversion |

### ReturnValue

[String](../../string/) containing hexadecimal representation of the specified range of elements of the specified array

## Voir aussi

* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Class [BitConverter](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## BitConverter::ToString(const ArrayPtr\<uint8_t\>\&, int, int) method


Convertit une plage de valeurs du tableau d'octets spécifié en leur représentation sous forme de chaîne hexadécimale.

```cpp
static String System::BitConverter::ToString(const ArrayPtr<uint8_t> &value, int startIndex, int length)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| value | const ArrayPtr\<uint8_t\>\& | [Array](../../array/) qui contient les octets à convertir |
| startIndex | int | Index dans le tableau spécifié où commence la plage des éléments du tableau d'octets à convertir |
| longueur | int | Longueur de la plage des éléments du tableau d'octets à convertir |

### ReturnValue

[String](../../string/) containing hexadecimal representation of the specified range of elements of the specified array

## Voir aussi

* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Class [BitConverter](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
