---
title: "Aspose::Page::EPS::XMP::XmpMetadata::Remove method"
linktitle: "Remove"
second_title: "Aspose.Page per C++"
description: "Aspose::Page::EPS::XMP::XmpMetadata::Remove method. Rimuove la coppia chiave/valore dalla collezione in C++."
type: docs
weight: 2200
url: /it/cpp/aspose.page.eps.xmp/xmpmetadata/remove/
---
## XmpMetadata::Remove(const System::Collections::Generic::KeyValuePair\<System::String, System::SharedPtr\<XmpValue\>\>\&) method


Rimuove la coppia chiave/valore dalla collezione.

```cpp
bool Aspose::Page::EPS::XMP::XmpMetadata::Remove(const System::Collections::Generic::KeyValuePair<System::String, System::SharedPtr<XmpValue>> &item) override
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| item | const System::Collections::Generic::KeyValuePair\\<System::String, System::SharedPtr\\<XmpValue\\>\\>\\& | Coppia chiave/valore da rimuovere. |

### ReturnValue

true se la coppia è stata trovata e rimossa.

## Vedi anche

* Class [KeyValuePair](../../../system.collections.generic/keyvaluepair/)
* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmpValue](../../xmpvalue/)
* Class [XmpMetadata](../)
* Namespace [Aspose::Page::EPS::XMP](../../)
* Library [Aspose.Page for C++](../../../)
## XmpMetadata::Remove(const System::String\&) method


Rimuove la voce dai metadati.

```cpp
bool Aspose::Page::EPS::XMP::XmpMetadata::Remove(const System::String &key) override
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| chiave | const System::String\& | La chiave della voce da rimuovere. |

### ReturnValue

True - se la chiave è rimossa; altrimenti, false.

## Vedi anche

* Class [String](../../../system/string/)
* Class [XmpMetadata](../)
* Namespace [Aspose::Page::EPS::XMP](../../)
* Library [Aspose.Page for C++](../../../)
