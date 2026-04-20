---
title: "مساحة الأسماء System::Net::Sockets"
linktitle: "System::Net::Sockets"
second_title: "Aspose.Font لـ C++"
description: "كيفية استخدام مساحة الأسماء System::Net::Sockets في C++."
type: docs
weight: 5200
url: /ar/cpp/system.net.sockets/
---



## الفئات

| الفئة | الوصف |
| --- | --- |
| [IPPacketInformation](./ippacketinformation/) | يمثل معلومات حول الحزمة. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../system/makeobject/). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيتسبب ذلك في أخطاء وقت التشغيل أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل. |
| [LingerOption](./lingeroption/) | يحدد ما إذا كان المقبس سيظل متصلاً بعد استدعاء طريقة Close() أو Close(). كما يحدد الفترة التي سيظل فيها المقبس متصلاً إذا استمر إرسال البيانات. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../system/makeobject/). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيتسبب ذلك في أخطاء وقت التشغيل أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل. |
| [NetworkStream](./networkstream/) | يوفر تدفق البيانات الأساسي للوصول إلى الشبكة. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../system/makeobject/). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيتسبب ذلك في أخطاء وقت التشغيل أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل. |
| [Socket](./socket/) | الفئة [Socket](./socket/) تنفذ واجهة مقابس Berkeley. |
| [TcpClient](./tcpclient/) | يمثل عميلًا لخدمات الشبكة TCP. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../system/makeobject/). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيتسبب ذلك في أخطاء وقت التشغيل أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل. |
| [TcpListener](./tcplistener/) | يمثل مستمعًا لخدمات الشبكة TCP. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../system/makeobject/). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيتسبب ذلك في أخطاء وقت التشغيل أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل. |
| [UdpClient](./udpclient/) | يوفر خدمات شبكة بروتوكول بيانات المستخدم (UDP). يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../system/makeobject/). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيتسبب ذلك في أخطاء وقت التشغيل أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل. |
## Enums

| تعداد | الوصف |
| --- | --- |
| [AddressFamily](./addressfamily/) | يسرد عائلات العناوين. |
| [IOControlCode](./iocontrolcode/) | يسرد رموز التحكم في [IO](../system.io/). |
| [ProtocolFamily](./protocolfamily/) | يسرد عائلات البروتوكول. |
| [ProtocolType](./protocoltype/) | يسرد أنواع البروتوكول. |
| [SelectMode](./selectmode/) | يحدد الوضع لاستطلاع حالة المقبس. |
| [SocketError](./socketerror/) | يسرد أنواع أخطاء المقبس. |
| [SocketFlags](./socketflags/) | يوفر قيمًا ثابتة لرسائل المقبس. |
| [SocketOptionLevel](./socketoptionlevel/) | يحدد مستويات خيارات المقبس للفئة '[Socket](./socket/)' . |
| [SocketOptionName](./socketoptionname/) | يحدد أسماء خيارات المقبس للفئة [Socket](./socket/). |
| [SocketShutdown](./socketshutdown/) | يحدد الثوابت المستخدمة بواسطة طريقة [Socket.Shutdown](./socket/shutdown/). |
| [SocketType](./sockettype/) | يسرد أنواع المقبس. |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [SocketException](./socketexception/) |  |
## Functions

| دالة | الوصف |
| --- | --- |
| operator!= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator== | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
