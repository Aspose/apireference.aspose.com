---
title: "Aspose::Page::EPS::XMP::XmpMetadata::Remove metod"
linktitle: "Ta bort"
second_title: "Aspose.Page för C++"
description: "Aspose::Page::EPS::XMP::XmpMetadata::Remove metod. Tar bort nyckel/värde-par från samlingen i C++."
type: docs
weight: 2200
url: /sv/cpp/aspose.page.eps.xmp/xmpmetadata/remove/
---
## XmpMetadata::Remove(const System::Collections::Generic::KeyValuePair\<System::String, System::SharedPtr\<XmpValue\>\>\&) method


Tar bort nyckel/värde-par från samlingen.

```cpp
bool Aspose::Page::EPS::XMP::XmpMetadata::Remove(const System::Collections::Generic::KeyValuePair<System::String, System::SharedPtr<XmpValue>> &item) override
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| objekt | const System::Collections::Generic::KeyValuePair\<System::String, System::SharedPtr\<XmpValue\>\>\& | Nyckel/värde-par att tas bort. |

### ReturnValue

true om paret hittades och togs bort.

## Se även

* Class [KeyValuePair](../../../system.collections.generic/keyvaluepair/)
* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmpValue](../../xmpvalue/)
* Class [XmpMetadata](../)
* Namespace [Aspose::Page::EPS::XMP](../../)
* Library [Aspose.Page for C++](../../../)
## XmpMetadata::Remove(const System::String\&) method


Tar bort post från metadata.

```cpp
bool Aspose::Page::EPS::XMP::XmpMetadata::Remove(const System::String &key) override
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| nyckel | const System::String\& | Nyckeln för posten att ta bort. |

### ReturnValue

True - om nyckeln togs bort; annars false.

## Se även

* Class [String](../../../system/string/)
* Class [XmpMetadata](../)
* Namespace [Aspose::Page::EPS::XMP](../../)
* Library [Aspose.Page for C++](../../../)
