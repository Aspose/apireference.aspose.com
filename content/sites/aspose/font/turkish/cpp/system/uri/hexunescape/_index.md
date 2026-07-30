---
title: "System::Uri::HexUnescape yöntemi"
linktitle: "HexUnescape"
second_title: "Aspose.Font için C++"
description: "System::Uri::HexUnescape yöntemi. Belirtilen karakterin onaltılık temsilini C++'ta bir karaktere dönüştürür."
type: docs
weight: 4000
url: /tr/cpp/system/uri/hexunescape/
---
## Uri::HexUnescape method


Belirtilen karakterin onaltılık temsilini bir karaktere dönüştürür.

```cpp
static char16_t System::Uri::HexUnescape(const String &pattern, int32_t &index)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| desen | const String\& | Bir karakterin onaltılık temsilini içeren dize |
| indeks | int32_t\& | **pattern** içinde bir karakterin onaltılık temsilinin başladığı konum |

### ReturnValue

**index** konumundaki onaltılık kodlamayla temsil edilen karakter. **index** konumundaki karakter onaltılık kodlanmamışsa, **index** konumundaki karakter döndürülür. **index** değerinin, döndürülen karakterin sonrasındaki karakteri işaret edecek şekilde artırıldığı belirtilir.

## Ayrıca Bakınız

* Class [String](../../string/)
* Class [Uri](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
