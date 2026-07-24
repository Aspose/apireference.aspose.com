---
title: "Aspose::Page::EPS::XMP::XmpMetadata::Remove метод"
linktitle: "Remove"
second_title: "Aspose.Page для C++"
description: "Aspose::Page::EPS::XMP::XmpMetadata::Remove метод. Удаляет пару ключ/значение из коллекции в C++."
type: docs
weight: 2200
url: /ru/cpp/aspose.page.eps.xmp/xmpmetadata/remove/
---
## XmpMetadata::Remove(const System::Collections::Generic::KeyValuePair\<System::String, System::SharedPtr\<XmpValue\>\>\&) method


Удаляет пару ключ/значение из коллекции.

```cpp
bool Aspose::Page::EPS::XMP::XmpMetadata::Remove(const System::Collections::Generic::KeyValuePair<System::String, System::SharedPtr<XmpValue>> &item) override
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| item | const System::Collections::Generic::KeyValuePair\<System::String, System::SharedPtr\<XmpValue\>\>\& | Пара ключ/значение для удаления. |

### ReturnValue

true, если пара была найдена и удалена.

## См. также

* Class [KeyValuePair](../../../system.collections.generic/keyvaluepair/)
* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmpValue](../../xmpvalue/)
* Class [XmpMetadata](../)
* Namespace [Aspose::Page::EPS::XMP](../../)
* Library [Aspose.Page for C++](../../../)
## XmpMetadata::Remove(const System::String\&) method


Удаляет запись из метаданных.

```cpp
bool Aspose::Page::EPS::XMP::XmpMetadata::Remove(const System::String &key) override
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| ключ | const System::String\& | Ключ записи для удаления. |

### ReturnValue

True - если ключ удалён; иначе false.

## См. также

* Class [String](../../../system/string/)
* Class [XmpMetadata](../)
* Namespace [Aspose::Page::EPS::XMP](../../)
* Library [Aspose.Page for C++](../../../)
