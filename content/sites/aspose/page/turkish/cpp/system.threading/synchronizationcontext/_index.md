---
title: "System::Threading::SynchronizationContext sınıfı"
linktitle: "SynchronizationContext"
second_title: "Aspose.Page için C++"
description: "System::Threading::SynchronizationContext sınıfı. C++'de çeşitli senkronizasyon işlemleri arasında bir senkronizasyon bağlamını yaymak için temel işlevselliği sağlar."
type: docs
weight: 1100
url: /tr/cpp/system.threading/synchronizationcontext/
---
## SynchronizationContext class


Farklı senkronizasyon işlemleri arasında bir senkronizasyon bağlamını yaymak için temel işlevselliği sağlar.

```cpp
class SynchronizationContext : public System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| static [get_Current](./get_current/)() | Mevcut iş parçacığı için senkronizasyon bağlamını alır. |
| static [SetSynchronizationContext](./setsynchronizationcontext/)(const SharedPtr\<SynchronizationContext\>\&) | Mevcut iş parçacığı için senkronizasyon bağlamını ayarlar. |
| [SynchronizationContext](./synchronizationcontext/)() | RTTI bilgisi. |
## Açıklamalar


Bu sınıf, iş parçacıkları arasında senkronizasyon bağlamının yayılmasını sağlar ve geri aramaları veya çağrıları uygun iş parçacığına veya senkronizasyon bağlamına yönlendirmek için kullanılır.
Sahte uygulama.

## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [System::Threading](../)
* Library [Aspose.Page for C++](../../)
