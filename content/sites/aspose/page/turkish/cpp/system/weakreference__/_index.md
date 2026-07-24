---
title: "System::WeakReference<> sınıfı"
linktitle: "WeakReference<>"
second_title: "Aspose.Page için C++"
description: "System::WeakReference<> sınıfı. Zayıf bir referansı temsil eder; bu referans bir nesneyi işaret ederken, o nesnenin C++'da silinmesine izin verir."
type: docs
weight: 7800
url: /tr/cpp/system/weakreference__/
---
## WeakReference<> class


Bir nesneyi referans alırken aynı zamanda o nesnenin silinmesine izin veren zayıf referansı temsil eder.

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
| [WeakReference](./weakreference/)(const SmartPtr\<Object\>\&) | Belirtilen nesneyi referans alan [WeakReference](../weakreference/) sınıfının yeni bir örneğini başlatır. |
| [WeakReference](./weakreference/)(const SmartPtr\<Object\>\&, bool) | Belirtilen nesneyi referans alan [WeakReference](../weakreference/) sınıfının yeni bir örneğini başlatır. |
## Ayrıca Bakınız

* Class [WeakReference](../weakreference/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
