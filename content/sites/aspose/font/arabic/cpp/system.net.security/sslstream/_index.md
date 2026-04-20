---
title: "الفئة System::Net::Security::SslStream"
linktitle: "SslStream"
second_title: "Aspose.Font لـ C++"
description: "الفئة System::Net::Security::SslStream. تدفق يستخدم بروتوكول SSL للمصادقة على الخادم واختياريًا على العميل في C++."
type: docs
weight: 200
url: /ar/cpp/system.net.security/sslstream/
---
## SslStream class


دفق يستخدم بروتوكول SSL لمصادقة الخادم واختياريًا العميل.

```cpp
class SslStream : public System::Net::Security::AuthenticatedStream
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| virtual [AuthenticateAsClient](./authenticateasclient/)(String) | يقوم بالمصادقة على جانب العميل من الاتصال. |
| virtual [AuthenticateAsClient](./authenticateasclient/)(String, System::SharedPtr\<System::Security::Cryptography::X509Certificates::X509CertificateCollection\>, System::Security::Authentication::SslProtocols, bool) | يقوم بالمصادقة على جانب العميل من الاتصال. |
| [BeginRead](./beginread/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, AsyncCallback, System::SharedPtr\<Object\>) override | يبدأ عملية قراءة غير متزامنة. |
| [BeginWrite](./beginwrite/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, AsyncCallback, System::SharedPtr\<Object\>) override | يبدأ عملية كتابة غير متزامنة. |
| [Close](./close/)() override | يغلق التدفق. |
| [Dispose](./dispose/)(bool) override | يطلق جميع الموارد المستخدمة من قبل الكائن الحالي ويغلق التدفق. |
| [EndRead](./endread/)(System::SharedPtr\<IAsyncResult\>) override | ينتظر حتى يكتمل عملية القراءة غير المتزامنة المحددة. |
| [EndWrite](./endwrite/)(System::SharedPtr\<IAsyncResult\>) override | ينهي عملية كتابة غير متزامنة. ينتظر حتى يكتمل عملية الكتابة غير المتزامنة المحددة. |
| [Flush](./flush/)() override | يمسح مخازن هذا التدفق ويكتب جميع البيانات المخزنة مؤقتًا إلى التخزين الأساسي. |
| [get_CanRead](./get_canread/)() const override | يحدد ما إذا كان الدفق قابلًا للقراءة. |
| [get_CanSeek](./get_canseek/)() const override | يحدد ما إذا كان التدفق يدعم البحث. |
| [get_CanTimeout](./get_cantimeout/)() const override | يحصل على قيمة تحدد ما إذا كان التدفق الحالي يمكن أن ينتهي مهله. |
| [get_CanWrite](./get_canwrite/)() const override | يحدد ما إذا كان التدفق قابلًا للكتابة. |
| virtual [get_CheckCertRevocationStatus](./get_checkcertrevocationstatus/)() | يعيد قيمة تشير إلى ما إذا تم فحص قائمة إبطال الشهادات أثناء عملية التحقق من صحة الشهادة. |
| virtual [get_CipherAlgorithm](./get_cipheralgorithm/)() | يعيد خوارزمية التشفير. |
| virtual [get_CipherStrength](./get_cipherstrength/)() | يعيد قوة خوارزمية التشفير المستخدمة. |
| virtual [get_HashAlgorithm](./get_hashalgorithm/)() | يعيد خوارزمية التجزئة. |
| virtual [get_HashStrength](./get_hashstrength/)() | يعيد قوة خوارزمية التجزئة المستخدمة. |
| [get_IsAuthenticated](./get_isauthenticated/)() const override | يعيد قيمة تشير إلى ما إذا تم تمرير المصادقة بنجاح. |
| [get_IsEncrypted](./get_isencrypted/)() const override | يعيد قيمة تشير إلى ما إذا كانت البيانات المرسلة باستخدام هذا التدفق مشفرة. |
| [get_IsMutuallyAuthenticated](./get_ismutuallyauthenticated/)() const override | يعيد قيمة تشير إلى ما إذا كان الخادم والعميل قد تم مصادقتهما. |
| [get_IsServer](./get_isserver/)() const override | يعيد قيمة تشير إلى ما إذا كان الجانب المحلي للاتصال هو الخادم. |
| [get_IsSigned](./get_issigned/)() const override | يعيد قيمة تشير إلى ما إذا كانت البيانات المرسلة باستخدام هذا التدفق موقعة. |
| virtual [get_KeyExchangeStrength](./get_keyexchangestrength/)() | يعيد قوة خوارزمية تبادل المفاتيح المستخدمة. |
| [get_Length](./get_length/)() const override | يعيد طول التدفق بالبايت. |
| virtual [get_LocalCertificate](./get_localcertificate/)() | يعيد الشهادة المستخدمة للمصادقة على الطرف المحلي. |
| [get_Position](./get_position/)() const override | يعيد الموضع الحالي للتدفق. |
| [get_ReadTimeout](./get_readtimeout/)() const override | يحصل على قيمة، بالميليثانية، تحدد مدة محاولة التدفق للقراءة قبل انتهاء المهلة. |
| virtual [get_RemoteCertificate](./get_remotecertificate/)() | يعيد الشهادة المستخدمة للمصادقة على الطرف البعيد. |
| virtual [get_SslProtocol](./get_sslprotocol/)() | يعيد بروتوكول SSL. |
| [get_WriteTimeout](./get_writetimeout/)() const override | يحصل على قيمة، بالميليثانية، تحدد مدة محاولة التدفق للكتابة قبل انتهاء المهلة. |
| [Read](./read/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | يقرأ عدد البايتات المحدد من التدفق ويكتبها إلى مصفوفة البايتات المحددة. |
| [Read](./read/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | يقرأ عدد البايتات المحدد من التدفق ويكتبها إلى مصفوفة البايتات المحددة. |
| [Seek](./seek/)(int64_t, IO::SeekOrigin) override | يضبط موضع التدفق الممثل بالكائن الحالي. |
| [set_Position](./set_position/)(int64_t) override | يضبط موضع التدفق. |
| [set_ReadTimeout](./set_readtimeout/)(int32_t) override | يضبط قيمة تحدد ما إذا كان التدفق الحالي يمكن أن ينتهي مهله. |
| [set_WriteTimeout](./set_writetimeout/)(int32_t) override | يضبط قيمة، بالميليثانية، تحدد مدة محاولة التدفق للقراءة قبل انتهاء المهلة. |
| [SetLength](./setlength/)(int64_t) override | يضبط طول التدفق الممثل بالكائن الحالي. |
| [SslStream](./sslstream/)(System::SharedPtr\<IO::Stream\>) | ينشئ نسخة جديدة. |
| [SslStream](./sslstream/)(System::SharedPtr\<IO::Stream\>, bool) | ينشئ نسخة جديدة. |
| [SslStream](./sslstream/)(System::SharedPtr\<IO::Stream\>, bool, RemoteCertificateValidationCallback) | ينشئ نسخة جديدة. |
| [SslStream](./sslstream/)(System::SharedPtr\<IO::Stream\>, bool, RemoteCertificateValidationCallback, LocalCertificateSelectionCallback) | ينشئ نسخة جديدة. |
| [SslStream](./sslstream/)(System::SharedPtr\<IO::Stream\>, bool, RemoteCertificateValidationCallback, LocalCertificateSelectionCallback, EncryptionPolicy) | ينشئ نسخة جديدة. |
| [Write](./write/)(const ArrayPtr\<uint8_t\>\&) | يكتب مصفوفة البايت المحددة إلى التدفق. |
| [Write](./write/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | يكتب النطاق الفرعي المحدد من البايتات من مصفوفة البايتات المحددة إلى التدفق. |
| [Write](./write/)(const System::Details::ArrayView\<uint8_t\>\&) | يكتب مصفوفة البايت المحددة إلى التدفق. |
| [Write](./write/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | يكتب النطاق الفرعي المحدد من البايتات من مصفوفة البايتات المحددة إلى التدفق. |
## الحقول

| حقل | الوصف |
| --- | --- |
| static [Null](../../system.io/stream/null/) | تدفق بدون تخزين أساسي. |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [AsyncResultType](./asyncresulttype/) | معلومات RTTI. |
| [StreamImplementationPtr](./streamimplementationptr/) | نوع المؤشر إلى التنفيذ. |
## انظر أيضًا

* Class [AuthenticatedStream](../authenticatedstream/)
* Namespace [System::Net::Security](../)
* Library [Aspose.Font for C++](../../)
