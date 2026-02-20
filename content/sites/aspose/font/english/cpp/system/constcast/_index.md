---
title: System::ConstCast method
linktitle: ConstCast
second_title: Aspose.Font for C++
description: 'System::ConstCast method. End of deprecated casts in C++.'
type: docs
weight: 16200
url: /cpp/system/constcast/
---
## System::ConstCast method


End of deprecated casts.

```cpp
template<typename TTo,typename TFrom> CastResult<TTo>::type System::ConstCast(const SmartPtr<TFrom> &obj)
```


| Parameter | Description |
| --- | --- |
| TTo | Target pointee type. |
| TFrom | Source pointee type. |

| Parameter | Type | Description |
| --- | --- | --- |
| obj | const SmartPtr\<TFrom\>\& | Source pointer. |

### ReturnValue

Cast result if cast is allowed or nullptr otherwise.
## Remarks


Performs const cast on [SmartPtr](../smartptr/) objects. 
## See Also

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
