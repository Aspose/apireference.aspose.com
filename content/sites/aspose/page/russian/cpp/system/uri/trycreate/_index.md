---
title: "System::Uri::TryCreate метод"
linktitle: "TryCreate"
second_title: "Aspose.Page для C++"
description: "Метод System::Uri::TryCreate. Создаёт объект Uri из указанного базового и относительных URI в C++."
type: docs
weight: 4400
url: /ru/cpp/system/uri/trycreate/
---
## Uri::TryCreate(const SharedPtr\<Uri\>\&, const SharedPtr\<Uri\>\&, SharedPtr\<Uri\>\&) method


Создаёт объект [Uri](../) из указанного базового и относительных URI.

```cpp
static bool System::Uri::TryCreate(const SharedPtr<Uri> &baseUri, const SharedPtr<Uri> &relativeUri, SharedPtr<Uri> &result)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| baseUri | const SharedPtr\<Uri\>\& | Базовый URI |
| relativeUri | const SharedPtr\<Uri\>\& | Относительный URI, который добавляется к базовому URI |
| result | SharedPtr\<Uri\>\& | Выходной аргумент, который при успешном построении указывает на вновь созданный объект [Uri](../) при возврате из метода |

### ReturnValue

True, если построение удалось, иначе — false

## См. также

* Typedef [SharedPtr](../../sharedptr/)
* Class [Uri](../)
* Class [Uri](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Uri::TryCreate(const SharedPtr\<Uri\>\&, const String\&, SharedPtr\<Uri\>\&) method


Создаёт объект [Uri](../) из указанного объекта [Uri](../), представляющего базовый URI, и строкового представления относительного URI.

```cpp
static bool System::Uri::TryCreate(const SharedPtr<Uri> &baseUri, const String &relativeUri, SharedPtr<Uri> &result)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| baseUri | const SharedPtr\<Uri\>\& | Базовый URI |
| relativeUri | const String\& | Относительный URI, который добавляется к базовому URI |
| result | SharedPtr\<Uri\>\& | Выходной аргумент, который при успешном построении указывает на вновь созданный объект [Uri](../) при возврате из метода |

### ReturnValue

True, если построение удалось, иначе — false

## См. также

* Typedef [SharedPtr](../../sharedptr/)
* Class [Uri](../)
* Class [String](../../string/)
* Class [Uri](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Uri::TryCreate(const String\&, UriKind, SharedPtr\<Uri\>\&) method


Создаёт объект [Uri](../), представляющий указанный URI; аргумент указывает тип URI.

```cpp
static bool System::Uri::TryCreate(const String &uriString, UriKind uriKind, SharedPtr<Uri> &result)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| uriString | const String\& | Строковый URI, который будет представлен создаваемым объектом |
| uriKind | UriKind | Указывает тип URI |
| result | SharedPtr\<Uri\>\& | Выходной аргумент, который при успешном построении указывает на вновь созданный объект [Uri](../) при возврате из метода |

### ReturnValue

True, если построение удалось, иначе — false

## См. также

* Class [String](../../string/)
* Enum [UriKind](../../urikind/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [Uri](../)
* Class [Uri](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
