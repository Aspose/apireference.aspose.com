---
title: "System::Xml::NameTable::Get method"
linktitle: "Obtener"
second_title: "Aspose.Page para C++"
description: "System::Xml::NameTable::Get method. Devuelve la cadena atomizada que contiene los mismos caracteres que el rango especificado de caracteres en la matriz dada en C++."
type: docs
weight: 300
url: /es/cpp/system.xml/nametable/get/
---
## NameTable::Get(const ArrayPtr\<char16_t\>\&, int32_t, int32_t) method


Devuelve la cadena atomizada que contiene los mismos caracteres que el rango especificado de caracteres en la matriz dada.

```cpp
const String & System::Xml::NameTable::Get(const ArrayPtr<char16_t> &key, int32_t start, int32_t len) override
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| clave | const ArrayPtr\<char16_t\>\& | La matriz de caracteres que contiene el nombre a buscar. |
| inicio | int32_t | El índice basado en cero en la matriz que especifica el primer carácter del nombre. |
| len | int32_t | El número de caracteres en el nombre. |

### ReturnValue

La cadena atomizada o **nullptr** si la cadena no ha sido atomizada previamente. Si **len** es cero, se devuelve [String::Empty](../../../system/string/empty/).

## Ver también

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [NameTable](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## NameTable::Get(const String\&) method


Devuelve la cadena atomizada con el valor especificado.

```cpp
const String & System::Xml::NameTable::Get(const String &value) override
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| value | const String\& | El nombre a buscar. |

### ReturnValue

El objeto de cadena atomizada o **nullptr** si la cadena no ha sido atomizada previamente.

## Ver también

* Class [String](../../../system/string/)
* Class [NameTable](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
