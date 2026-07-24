---
title: "System::Uri::HexUnescape yöntemi"
linktitle: "HexUnescape"
second_title: "Aspose.Page için C++"
description: "System::Uri::HexUnescape yöntemi. Belirtilen karakterin onaltılık temsiliğini C++'ta bir karaktere dönüştürür."
type: docs
weight: 4000
url: /tr/cpp/system/uri/hexunescape/
---
## Uri::HexUnescape method


Belirtilen karakterin onaltılık temsilini bir karaktere dönüştürür.

```cpp
static char16_t System::Uri::HexUnescape(const String &pattern, int32_t &index)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| pattern | const String\& | Bir karakterin onaltılık temsiliğini içeren bir dize |
| indeks | int32_t\& | Bir karakterin onaltılık temsiliğinin başladığı **pattern** içindeki konum |

### ReturnValue

**index** konumundaki onaltılık kodlamasıyla temsil edilen karakter. Eğer **index** konumundaki karakter onaltılık olarak kodlanmamışsa, **index** konumundaki karakter döndürülür. **index** değeri, döndürülen karakterin sonrasındaki karakteri gösterecek şekilde artırılır.

## Ayrıca Bakınız

* Class [String](../../string/)
* Class [Uri](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
