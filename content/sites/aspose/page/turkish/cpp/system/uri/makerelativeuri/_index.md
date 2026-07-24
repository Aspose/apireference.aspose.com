---
title: "System::Uri::MakeRelativeUri metodu"
linktitle: "MakeRelativeUri"
second_title: "Aspose.Page için C++"
description: "System::Uri::MakeRelativeUri metodu. Geçerli ve belirtilen Uri nesneleri tarafından temsil edilen URI'lar arasındaki farkı belirler (C++)."
type: docs
weight: 3100
url: /tr/cpp/system/uri/makerelativeuri/
---
## Uri::MakeRelativeUri method


Geçerli ve belirtilen [Uri](../) nesneleri tarafından temsil edilen URI'lar arasındaki farkı belirler.

```cpp
SharedPtr<Uri> System::Uri::MakeRelativeUri(const SharedPtr<Uri> &uri)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| uri | const SharedPtr\<Uri\>\& | Karşılaştırılan değer |

### ReturnValue

Geçerli nesne ve **toUri** tarafından temsil edilen URI'ların ana bilgisayar adı ve şeması aynıysa, bu metod mevcut URI örneğine eklendiğinde **toUri** elde edilen göreli bir [Uri](../) döndürür. Ana bilgisayar adı veya şema farklıysa, bu metod **uri** parametresini temsil eden bir [Uri](../) nesnesi döndürür.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../sharedptr/)
* Class [Uri](../)
* Class [Uri](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
