---
title: "System::Net::Http::Headers::RangeItemHeaderValue::GetRangeItemListLength‑metod"
linktitle: "GetRangeItemListLength"
second_title: "Aspose.Page för C++"
description: "System::Net::Http::Headers::RangeItemHeaderValue::GetRangeItemListLength‑metod. Konverterar en given sträng från den angivna positionen till en samling av instanser av klassen RangeItemHeaderValue i C++."
type: docs
weight: 800
url: /sv/cpp/system.net.http.headers/rangeitemheadervalue/getrangeitemlistlength/
---
## RangeItemHeaderValue::GetRangeItemListLength method


Konverterar en given sträng från den angivna positionen till samlingen av RangeItemHeaderValue-klassens instanser.

```cpp
static int32_t System::Net::Http::Headers::RangeItemHeaderValue::GetRangeItemListLength(String input, int32_t startIndex, System::SharedPtr<Collections::Generic::ICollection<System::SharedPtr<RangeItemHeaderValue>>> rangeCollection)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| inmatning | String | En sträng att parsa. |
| startIndex | int32_t | En startposition för parsning. |
| rangeCollection | System::SharedPtr\<Collections::Generic::ICollection\<System::SharedPtr\<RangeItemHeaderValue\>\>\> | En instans där en analyserad samling kommer att tilldelas. |

### ReturnValue

Längden på en analyserad delsträng, annars 0.

## Se även

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ICollection](../../../system.collections.generic/icollection/)
* Class [RangeItemHeaderValue](../)
* Class [RangeItemHeaderValue](../)
* Namespace [System::Net::Http::Headers](../../)
* Library [Aspose.Page for C++](../../../)
