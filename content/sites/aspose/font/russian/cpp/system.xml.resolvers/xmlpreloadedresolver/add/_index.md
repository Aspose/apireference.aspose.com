---
title: "System::Xml::Resolvers::XmlPreloadedResolver::Add метод"
linktitle: "Add"
second_title: "Aspose.Font для C++"
description: "System::Xml::Resolvers::XmlPreloadedResolver::Add метод. Добавляет массив байтов в хранилище XmlPreloadedResolver и сопоставляет его с URI. Если хранилище уже содержит сопоставление для того же URI, существующее сопоставление переопределяется в C++."
type: docs
weight: 200
url: /ru/cpp/system.xml.resolvers/xmlpreloadedresolver/add/
---
## XmlPreloadedResolver::Add(const SharedPtr\<Uri\>\&, const ArrayPtr\<uint8_t\>\&) method


Добавляет массив байтов в хранилище [XmlPreloadedResolver](../) и сопоставляет его с URI. Если хранилище уже содержит сопоставление для того же URI, существующее сопоставление переопределяется.

```cpp
void System::Xml::Resolvers::XmlPreloadedResolver::Add(const SharedPtr<Uri> &uri, const ArrayPtr<uint8_t> &value)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| uri | const SharedPtr\<Uri\>\& | URI данных, которые добавляются в хранилище [XmlPreloadedResolver](../). |
| значение | const ArrayPtr\<uint8_t\>\& | Массив байтов с данными, соответствующими предоставленному URI. |

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Uri](../../../system/uri/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XmlPreloadedResolver](../)
* Namespace [System::Xml::Resolvers](../../)
* Library [Aspose.Font for C++](../../../)
## XmlPreloadedResolver::Add(const SharedPtr\<Uri\>\&, const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


Добавляет массив байтов в хранилище [XmlPreloadedResolver](../) и сопоставляет его с URI. Если хранилище уже содержит сопоставление для того же URI, существующее сопоставление переопределяется.

```cpp
void System::Xml::Resolvers::XmlPreloadedResolver::Add(const SharedPtr<Uri> &uri, const ArrayPtr<uint8_t> &value, int32_t offset, int32_t count)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| uri | const SharedPtr\<Uri\>\& | URI данных, которые добавляются в хранилище [XmlPreloadedResolver](../). |
| значение | const ArrayPtr\<uint8_t\>\& | Массив байтов с данными, соответствующими предоставленному URI. |
| смещение | int32_t | Смещение в предоставленном массиве байтов, где начинаются данные. |
| count | int32_t | Количество байтов для чтения из массива байтов, начиная с предоставленного смещения. |

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Uri](../../../system/uri/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XmlPreloadedResolver](../)
* Namespace [System::Xml::Resolvers](../../)
* Library [Aspose.Font for C++](../../../)
## XmlPreloadedResolver::Add(const SharedPtr\<Uri\>\&, const SharedPtr\<IO::Stream\>\&) method


Добавляет объект Stream в хранилище [XmlPreloadedResolver](../) и сопоставляет его с URI. Если хранилище уже содержит сопоставление для того же URI, существующее сопоставление переопределяется.

```cpp
void System::Xml::Resolvers::XmlPreloadedResolver::Add(const SharedPtr<Uri> &uri, const SharedPtr<IO::Stream> &value)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| uri | const SharedPtr\<Uri\>\& | URI данных, которые добавляются в хранилище [XmlPreloadedResolver](../). |
| значение | const SharedPtr\<IO::Stream\>\& | Объект Stream с данными, соответствующими предоставленному URI. |

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Uri](../../../system/uri/)
* Class [Stream](../../../system.io/stream/)
* Class [XmlPreloadedResolver](../)
* Namespace [System::Xml::Resolvers](../../)
* Library [Aspose.Font for C++](../../../)
## XmlPreloadedResolver::Add(const SharedPtr\<Uri\>\&, const String\&) method


Добавляет строку с предварительно загруженными данными в хранилище [XmlPreloadedResolver](../) и сопоставляет её с URI. Если хранилище уже содержит сопоставление для того же URI, существующее сопоставление переопределяется.

```cpp
void System::Xml::Resolvers::XmlPreloadedResolver::Add(const SharedPtr<Uri> &uri, const String &value)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| uri | const SharedPtr\<Uri\>\& | URI данных, которые добавляются в хранилище [XmlPreloadedResolver](../). |
| value | const String\& | Объект [String](../../../system/string/) с данными, соответствующими предоставленному URI. |

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [XmlPreloadedResolver](../)
* Namespace [System::Xml::Resolvers](../../)
* Library [Aspose.Font for C++](../../../)
