---
title: "System::Threading::Tasks::ValueTask sınıfı"
linktitle: "ValueTask"
second_title: "Aspose.Page için C++"
description: "System::Threading::Tasks::ValueTask sınıfı. C++'ta bir asenkron işlemin beklenebilir sonucunu sağlar."
type: docs
weight: 500
url: /tr/cpp/system.threading.tasks/valuetask/
---
## ValueTask class


Bir asenkron işlemin beklenebilir sonucunu sağlar.

```cpp
class ValueTask : public System::IEquatable<ValueTask>,
                  public System::Details::BoxableObjectBase
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [AsTask](./astask/)() const | Bu [ValueTask](./) nesnesini [Task](../task/) nesnesine bir paylaşımlı işaretçiye dönüştürür. |
| [ConfigureAwait](./configureawait/)(bool) const | Bu görev için bir awaiter yapılandırır. |
| [Equals](./equals/)(ValueTask) override | Bu örneğin başka bir [ValueTask](./) örneğine eşit olup olmadığını belirler. |
| [Equals](./equals/)(System::SharedPtr\<System::Object\>) override | Bu örneğin başka bir nesneye eşit olup olmadığını belirler. |
| [get_IsCanceled](./get_iscanceled/)() const | Görevin iptal edilmesi nedeniyle tamamlanıp tamamlanmadığını gösteren bir değer alır. |
| [get_IsCompleted](./get_iscompleted/)() const | Görevin tamamlanıp tamamlanmadığını gösteren bir değer alır. |
| [get_IsCompletedSuccessfully](./get_iscompletedsuccessfully/)() const | Görevin başarıyla tamamlanıp tamamlanmadığını gösteren bir değer alır. |
| [get_IsFaulted](./get_isfaulted/)() const | Görevin işlenmemiş bir istisna nedeniyle tamamlanıp tamamlanmadığını gösteren bir değer alır. |
| [GetAwaiter](./getawaiter/)() const | Bu görev için await ifadelerini destekleyecek bir awaiter alır. |
| [operator!=](./operator!=/)(const ValueTask\&) const | [ValueTask](./) için eşitsizlik operatörü. |
| [operator==](./operator==/)(const ValueTask\&) const | [ValueTask](./) için eşitlik operatörü. |
| [ValueTask](./valuetask/)() | Boş, başlatılmamış bir [ValueTask](./) oluşturur. |
| [ValueTask](./valuetask/)(const TaskPtr\&) | Bir [Task](../task/) paylaşımlı işaretçisinden bir [ValueTask](./) oluşturur. |
## Ayrıca Bakınız

* Class [IEquatable](../../system/iequatable/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Page for C++](../../)
