---
title: "System::Uri::MakeRelativeUri metodu"
linktitle: "MakeRelativeUri"
second_title: "Aspose.Font için C++"
description: "System::Uri::MakeRelativeUri metodu. Geçerli nesne ve belirtilen Uri nesneleri tarafından temsil edilen URI'ler arasındaki farkı C++'ta belirler."
type: docs
weight: 3100
url: /tr/cpp/system/uri/makerelativeuri/
---
## Uri::MakeRelativeUri method


Geçerli nesne ve belirtilen [Uri](../) nesneleri tarafından temsil edilen URI'ler arasındaki farkı belirler.

```cpp
SharedPtr<Uri> System::Uri::MakeRelativeUri(const SharedPtr<Uri> &uri)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| uri | const SharedPtr\<Uri\>\& | Karşılaştırılan değer |

### ReturnValue

Geçerli nesne tarafından temsil edilen URI'lerin ana bilgisayar adı ve şeması **toUri** ile aynı ise, bu metod mevcut URI örneğine eklendiğinde **toUri** elde edilen bir göreli [Uri](../) döndürür. Ana bilgisayar adı veya şema farklı ise, bu metod **uri** parametresini temsil eden bir [Uri](../) nesnesi döndürür.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../sharedptr/)
* Class [Uri](../)
* Class [Uri](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
