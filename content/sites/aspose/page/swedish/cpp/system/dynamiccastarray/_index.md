---
title: "System::DynamicCastArray metod"
linktitle: "DynamicCastArray"
second_title: "Aspose.Page för C++"
description: "System::DynamicCastArray metod. Utför typomvandling av element i den angivna arrayen till en annan typ i C++."
type: docs
weight: 17900
url: /sv/cpp/system/dynamiccastarray/
---
## System::DynamicCastArray method


Utför typomvandling av element i den angivna arrayen till en annan typ.

```cpp
template<class To,class From> SharedPtr<Array<To>> System::DynamicCastArray(const SharedPtr<Array<From>> &from)
```


| Parameter | Beskrivning |
| --- | --- |
| Till | Typen att konvertera elementen i den angivna arrayen till |
| From | Typen av element i de element av arrayen som ska konverteras |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| från | const SharedPtr\<Array\<From\>\>\& | Delad pekare till arrayen som innehåller elementen som ska konverteras |

### ReturnValue

En pekare till en ny array som innehåller element av typen **To** motsvarande elementen i **from**

## Deprecated
Tillagd för bakåtkompatibilitet. Använd ExplicitCast istället.

## Se även

* Typedef [SharedPtr](../sharedptr/)
* Class [Array](../array/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
