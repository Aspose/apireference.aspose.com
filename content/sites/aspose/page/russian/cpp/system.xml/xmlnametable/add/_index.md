---
title: "System::Xml::XmlNameTable::Add метод"
linktitle: "Add"
second_title: "Aspose.Page для C++"
description: "System::Xml::XmlNameTable::Add метод. При переопределении в производном классе атомизирует указанную строку и добавляет её в XmlNameTable на C++."
type: docs
weight: 100
url: /ru/cpp/system.xml/xmlnametable/add/
---
## XmlNameTable::Add(const ArrayPtr\<char16_t\>\&, int32_t, int32_t) method


При переопределении в производном классе атомизирует указанную строку и добавляет её в [XmlNameTable](../).

```cpp
virtual const String & System::Xml::XmlNameTable::Add(const ArrayPtr<char16_t> &array, int32_t offset, int32_t length)=0
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| массив | const ArrayPtr\<char16_t\>\& | Массив символов, содержащий имя для добавления. |
| смещение | int32_t | Нулевой индекс в массиве, указывающий первый символ имени. |
| length | int32_t | Количество символов в имени. |

### ReturnValue

Новая атомизированная строка или существующая, если она уже есть. Если length равно нулю, возвращается [String::Empty](../../../system/string/empty/).

## См. также

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XmlNameTable](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlNameTable::Add(const String\&) method


При переопределении в производном классе атомизирует указанную строку и добавляет её в [XmlNameTable](../).

```cpp
virtual const String & System::Xml::XmlNameTable::Add(const String &array)=0
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| массив | const String\& | Имя для добавления. |

### ReturnValue

Новая атомизированная строка или существующая, если она уже есть.

## См. также

* Class [String](../../../system/string/)
* Class [XmlNameTable](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
