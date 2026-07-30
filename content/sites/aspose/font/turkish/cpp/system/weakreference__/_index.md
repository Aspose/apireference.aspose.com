---
title: "System::WeakReference<> sınıfı"
linktitle: "WeakReference<>"
second_title: "Aspose.Font için C++"
description: "System::WeakReference<> sınıfı. Zayıf bir referansı temsil eder; bu referans bir nesneyi işaret ederken, nesnenin C++'ta silinmesine izin verir."
type: docs
weight: 7800
url: /tr/cpp/system/weakreference__/
---
## WeakReference<> class


Bir nesneyi referans alırken yine de o nesnenin silinmesine izin veren zayıf bir referansı temsil eder.

```cpp
class WeakReference<> : public System::WeakReference<System::Object>
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [get_IsAlive](./get_isalive/)() const | Geçerli [WeakReference](../weakreference/) nesnesi tarafından referans verilen nesnenin silinip silinmediğine dair bir gösterge alır. |
| [get_Target](./get_target/)() const | Geçerli [WeakReference](../weakreference/) nesnesi tarafından referans verilen nesneyi (hedefi) alır. |
| [set_Target](./set_target/)(const SmartPtr\<Object\>\&) | Geçerli [WeakReference](../weakreference/) nesnesi tarafından referans verilen nesneyi (hedefi) ayarlar. |
| [WeakReference](./weakreference/)() | Varsayılan yapıcı. |
| [WeakReference](./weakreference/)(std::nullptr_t) | nullptr'tan yapıcı. |
| [WeakReference](./weakreference/)(const SmartPtr\<Object\>\&) | [WeakReference](../weakreference/) sınıfının yeni bir örneğini başlatır, belirtilen nesneyi referans alır. |
| [WeakReference](./weakreference/)(const SmartPtr\<Object\>\&, bool) | [WeakReference](../weakreference/) sınıfının yeni bir örneğini başlatır, belirtilen nesneyi referans alır. |
## Ayrıca Bakınız

* Class [WeakReference](../weakreference/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
