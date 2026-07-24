---
title: "System::Uri::MakeRelative yöntemi"
linktitle: "MakeRelative"
second_title: "Aspose.Page için C++"
description: "System::Uri::MakeRelative yöntemi. C++'ta iki Uri örneği arasındaki farkı belirler."
type: docs
weight: 3000
url: /tr/cpp/system/uri/makerelative/
---
## Uri::MakeRelative method


İki [Uri](../) örneği arasındaki farkı belirler.

```cpp
String System::Uri::MakeRelative(const SharedPtr<Uri> &toUri)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| toUri | const SharedPtr\<Uri\>\& | Mevcut URI ile karşılaştırılacak URI |

### ReturnValue

Mevcut nesne ve **toUri** tarafından temsil edilen URI'ların ana bilgisayar adı ve şeması aynıysa, bu yöntem mevcut URI örneğine eklendiğinde **toUri** elde edilen, göreli bir [Uri](../) temsil eden bir [String](../../string/) döndürür. Ana bilgisayar adı veya şema farklıysa, bu yöntem **uri** parametresini temsil eden bir [String](../../string/) döndürür.

## Ayrıca Bakınız

* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [Uri](../)
* Class [Uri](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
