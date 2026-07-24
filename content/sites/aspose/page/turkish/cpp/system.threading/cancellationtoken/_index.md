---
title: "System::Threading::CancellationToken class"
linktitle: "CancellationToken"
second_title: "Aspose.Page için C++"
description: "System::Threading::CancellationToken sınıfı. İşlemlerin iptal edilmesi gerektiğine dair bildirimi yayar. Bu sınıf, iş parçacıkları arasında iş birliğine dayalı iptali sağlayan bir mekanizma sunar; bir iş parçacığının diğerlerine bir işlemin iptal edilmesi gerektiğini bildirmesine olanak tanır C++'de."
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
| [get_CanBeCanceled](./get_canbecanceled/)() const | Bu belirtecin iptal edilmiş durumda olma yeteneğine sahip olup olmadığını döndürür. |
| [get_IsCancellationRequested](./get_iscancellationrequested/)() const | Bu belirteç için iptal isteğinin yapılıp yapılmadığını döndürür. |
| static [get_None](./get_none/)() | Boş bir [System::Threading::CancellationToken](./) değeri döndürür. |
| [Register](./register/)(const Action<>\&) const | İptal istendiğinde çağrılacak bir geri çağırma kaydeder. |
| [ThrowIfCancellationRequested](./throwifcancellationrequested/)() const | İptal istendiğinde bir OperationCanceledException fırlatır. |
## Açıklamalar



[CancellationToken](./) yalnızca ilişkili [CancellationTokenSource](../cancellationtokensource/) aracılığıyla iptal edilebilir.

## Ayrıca Bakınız

* Namespace [System::Threading](../)
* Library [Aspose.Page for C++](../../)
