---
title: "kelas System::DynamicWeakPtr::Reference"
linktitle: "Reference"
second_title: "Aspose.Page untuk C++"
description: "kelas System::DynamicWeakPtr::Reference. Kelas referensi yang memastikan bahwa DynamicWeakPtr::Apply dipanggil. Digunakan jika DynamicWeakPtr diteruskan sebagai parameter referensi SmartPtr ke fungsi yang mungkin menugaskan padanya dalam C++."
type: docs
weight: 700
url: /id/cpp/system/dynamicweakptr/reference/
---
## Reference class


[Reference](./) class which ensures that DynamicWeakPtr::Apply is called. Used if [DynamicWeakPtr](../) is passed as [SmartPtr](../../smartptr/) reference parameter to function which may assign to it.

```cpp
class Reference
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [operator DynamicWeakPtr_ &](./operatordynamicweakptr_&/)() const | Operator konversi. Mengizinkan penggunaan [Reference](./) dalam konteks di mana [DynamicWeakPtr_](../dynamicweakptr_/) diperlukan. |
| [Reference](./reference/)(DynamicWeakPtr_\&) | Membuat referensi pointer pintar. |
| [Reference](./reference/)(Reference\&&) | Membuat referensi pointer pintar dengan move-construct. |
| [~Reference](./~reference/)() | Menghancurkan referensi. Memastikan pemanggilan Apply() pada pointer pintar yang direferensikan. |
## Lihat Juga

* Class [DynamicWeakPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
