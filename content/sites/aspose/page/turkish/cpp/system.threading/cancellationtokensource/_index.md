---
title: "System::Threading::CancellationTokenSource sınıfı"
linktitle: "CancellationTokenSource"
second_title: "Aspose.Page için C++"
description: "System::Threading::CancellationTokenSource sınıfı. C++'da iptal bildirimlerini tetiklemek için kullanılabilen bir iptal belirteci kaynağı."
type: docs
weight: 400
url: /tr/cpp/system.threading/cancellationtokensource/
---
## CancellationTokenSource class


İptal bildirimlerini tetiklemek için kullanılabilen bir iptal belirteci kaynağı.

```cpp
class CancellationTokenSource : public System::IDisposable
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Cancel](./cancel/)() | İptal isteğini iletir. |
| [CancellationTokenSource](./cancellationtokensource/)() | Yeni bir [CancellationTokenSource](./) oluşturur. |
| static [CreateLinkedTokenSource](./createlinkedtokensource/)(const CancellationToken\&, const CancellationToken\&) | Sağlanan belirteçlerden herhangi biri iptal edildiğinde iptal olan bağlı bir belirteç kaynağı oluşturur. |
| [Dispose](./dispose/)() override | [CancellationTokenSource](./) tarafından kullanılan tüm kaynakları serbest bırakır. |
| [get_IsCancellationRequested](./get_iscancellationrequested/)() const | İptalin istenip istenmediğini alır. |
| [get_Token](./get_token/)() const | Bu kaynakla ilişkili iptal belirtecini alır. |
## Açıklamalar


Operasyonların işbirlikçi iptali için iptal belirteçleri oluşturma ve kontrol etme mekanizmaları sağlar.
## Ayrıca Bakınız

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Threading](../)
* Library [Aspose.Page for C++](../../)
