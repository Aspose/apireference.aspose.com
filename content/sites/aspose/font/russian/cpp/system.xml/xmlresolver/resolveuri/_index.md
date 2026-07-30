---
title: "Метод System::Xml::XmlResolver::ResolveUri"
linktitle: "ResolveUri"
second_title: "Aspose.Font для C++"
description: "Метод System::Xml::XmlResolver::ResolveUri. При переопределении в производном классе определяет абсолютный URI из базового и относительного URI в C++."
type: docs
weight: 200
url: /ru/cpp/system.xml/xmlresolver/resolveuri/
---
## XmlResolver::ResolveUri method


При переопределении в производном классе разрешает абсолютный URI из базового и относительных URI.

```cpp
virtual SharedPtr<Uri> System::Xml::XmlResolver::ResolveUri(SharedPtr<Uri> baseUri, String relativeUri)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| baseUri | SharedPtr\<Uri\> | Базовый URI, используемый для разрешения относительного URI. |
| relativeUri | String | URI для разрешения. URI может быть абсолютным или относительным. Если абсолютный, это значение эффективно заменяет значение **baseUri**. Если относительный, он комбинируется с **baseUri**, чтобы получить абсолютный URI. |

### ReturnValue

Абсолютный URI или **nullptr**, если относительный URI невозможно разрешить.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [XmlResolver](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
