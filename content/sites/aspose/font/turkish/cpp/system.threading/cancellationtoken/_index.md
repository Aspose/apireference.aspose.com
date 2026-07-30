---
title: "System::Threading::CancellationToken class"
linktitle: "CancellationToken"
second_title: "Aspose.Font için C++"
description: "System::Threading::CancellationToken sınıfı. İşlemlerin iptal edilmesi gerektiğine dair bildirimi yayar. Bu sınıf, iptal işlemlerinin iş parçacıkları arasında iş birliğiyle yapılması için bir mekanizma sağlar; bir iş parçacığının diğerlerine bir işlemin iptal edilmesi gerektiğini bildirmesine olanak tanır C++'de."
type: docs
weight: 200
url: /tr/cpp/system.threading/cancellationtoken/
---
## CancellationToken class


İşlemlerin iptal edilmesi gerektiğine dair bildirimi yayar. Bu sınıf, iş parçacıkları arasında iş birliğine dayalı iptal mekanizması sağlar; bir iş parçacığının bir işlemin iptal edilmesi gerektiğini diğerlerine bildirmesine olanak tanır.

```cpp
class CancellationToken : public System::Details::BoxableObjectBase
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [CancellationToken](./cancellationtoken/)() | Varsayılan yapıcı. |
| [get_CanBeCanceled](./get_canbecanceled/)() const | Bu tokenin iptal edilmiş durumda olma yeteneğine sahip olup olmadığını alır. |
| [get_IsCancellationRequested](./get_iscancellationrequested/)() const | Bu token için iptalin istekte bulunulup bulunmadığını alır. |
| static [get_None](./get_none/)() | Boş bir [System::Threading::CancellationToken](./) değeri döndürür. |
| [Register](./register/)(const Action<>\&) const | İptalin istendiğinde çağrılacak bir geri arama (callback) kaydeder. |
| [ThrowIfCancellationRequested](./throwifcancellationrequested/)() const | İptal istenmişse bir OperationCanceledException fırlatır. |
## Açıklamalar



Bir [CancellationToken](./) yalnızca ilişkili [CancellationTokenSource](../cancellationtokensource/) aracılığıyla iptal edilebilir.

## Ayrıca Bakınız

* Namespace [System::Threading](../)
* Library [Aspose.Font for C++](../../)
