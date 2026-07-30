---
title: "System::Net::Dns class"
linktitle: "Dns"
second_title: "Aspose.Font لـ C++"
description: "System::Net::Dns class. يوفر طرقًا للعمل مع DNS في C++."
type: docs
weight: 700
url: /ar/cpp/system.net/dns/
---
## Dns class


يوفر طرقًا للعمل مع DNS.

```cpp
class Dns : public System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| static [BeginGetHostAddresses](./begingethostaddresses/)(String, AsyncCallback, System::SharedPtr\<Object\>) | يبدأ عملية غير متزامنة لإنشاء نسخة من IPHostEntry-class باستخدام السلسلة المحددة التي تحتوي على اسم مضيف أو عنوان IP. |
| static [BeginGetHostByName](./begingethostbyname/)(String, AsyncCallback, System::SharedPtr\<Object\>) | يبدأ عملية غير متزامنة لإنشاء نسخة من IPHostEntry-class باستخدام اسم المضيف المحدد. |
| static [BeginGetHostEntry](./begingethostentry/)(String, AsyncCallback, System::SharedPtr\<Object\>) | يبدأ عملية غير متزامنة لإنشاء نسخة من IPHostEntry-class باستخدام السلسلة المحددة التي تحتوي على اسم مضيف أو عنوان IP. |
| static [BeginGetHostEntry](./begingethostentry/)(System::SharedPtr\<IPAddress\>, AsyncCallback, System::SharedPtr\<Object\>) | يبدأ عملية غير متزامنة لإنشاء نسخة من IPHostEntry-class باستخدام عنوان IP المحدد. |
| static [BeginResolve](./beginresolve/)(String, AsyncCallback, System::SharedPtr\<Object\>) | يبدأ عملية غير متزامنة لإنشاء نسخة من IPHostEntry-class باستخدام اسم المضيف المحدد. |
| [Dns](./dns/)() | المنشئ الافتراضي المحذوف. |
| static [EndGetHostAddresses](./endgethostaddresses/)(System::SharedPtr\<IAsyncResult\>) | ينتظر حتى تكتمل العملية غير المتزامنة المحددة لإنشاء نسخة من IPHostEntry-class. |
| static [EndGetHostByName](./endgethostbyname/)(System::SharedPtr\<IAsyncResult\>) | ينتظر حتى تكتمل العملية غير المتزامنة المحددة لإنشاء نسخة من IPHostEntry-class. |
| static [EndGetHostEntry](./endgethostentry/)(System::SharedPtr\<IAsyncResult\>) | ينتظر حتى تكتمل العملية غير المتزامنة المحددة لإنشاء نسخة من IPHostEntry-class. |
| static [EndResolve](./endresolve/)(System::SharedPtr\<IAsyncResult\>) | ينتظر حتى تكتمل العملية غير المتزامنة المحددة لإنشاء نسخة من IPHostEntry-class. |
| static [GetHostAddresses](./gethostaddresses/)(String) | يرجع مجموعة من عناوين IP لاسم المضيف أو عنوان IP المحدد. |
| static [GetHostByAddress](./gethostbyaddress/)(String) | ينشئ نسخة جديدة من IPHostEntry-class باستخدام تمثيل السلسلة المحدد لعنوان IP. |
| static [GetHostByAddress](./gethostbyaddress/)(System::SharedPtr\<IPAddress\>) | ينشئ نسخة جديدة من IPHostEntry-class باستخدام عنوان IP المحدد. |
| static [GetHostByName](./gethostbyname/)(String) | معلومات RTTI. |
| static [GetHostEntry](./gethostentry/)(String) | ينشئ نسخة جديدة من IPHostEntry-class باستخدام السلسلة المحددة التي تحتوي على اسم مضيف أو عنوان IP. |
| static [GetHostEntry](./gethostentry/)(System::SharedPtr\<IPAddress\>) | ينشئ نسخة جديدة من IPHostEntry-class باستخدام عنوان IP المحدد. |
| static [GetHostName](./gethostname/)() | يعيد اسم المضيف للجهاز المحلي. |
| static [Resolve](./resolve/)(String) | ينشئ مثيلًا جديدًا من الفئة IPHostEntry-class باستخدام اسم المضيف المحدد. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)
