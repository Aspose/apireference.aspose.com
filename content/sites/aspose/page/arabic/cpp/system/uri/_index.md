---
title: "فئة System::Uri"
linktitle: "Uri"
second_title: "Aspose.Page لـ C++"
description: "فئة System::Uri. معرف موحد للموارد. يجب إنشاء كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبدًا بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيسبّب أخطاءً وقت التشغيل أو أعطالًا في التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 6700
url: /ar/cpp/system/uri/
---
## Uri class


معرف موحد للموارد. يجب إنشاء كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../makeobject/). لا تقم أبدًا بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيسبّب أخطاءً وقت التشغيل أو أعطالًا في التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class Uri : public System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| static [CheckHostName](./checkhostname/)(String) | يحدد نوع اسم المضيف المحدد. |
| static [CheckSchemeName](./checkschemename/)(const String\&) | يحدد ما إذا كان المخطط المحدد صالحًا. |
| static [Compare](./compare/)(const SharedPtr\<Uri\>\&, const SharedPtr\<Uri\>\&, UriComponents, UriFormat, StringComparison) | يقارن الكائنات [Uri](./) المحددة باستخدام قواعد المقارنة المحددة. |
| [Equals](./equals/)(SharedPtr\<Object\>) override | يحدد ما إذا كانت عناوين URI التي يمثلها الكائن الحالي والكائن المحدد متساوية. |
| static [EscapeDataString](./escapedatastring/)(const String\&) | يحوّل سلسلة إلى تمثيلها المُهَرَّب. |
| static [EscapeUriString](./escapeuristring/)(const String\&) | يحوّل سلسلة URI إلى تمثيلها المُهَرَّب. |
| static [FromHex](./fromhex/)(char16_t) | يحصل على القيمة العشرية للرقم السداسي العشري. |
| [get_AbsolutePath](./get_absolutepath/)() const | يرجع المسار المطلق للـ URI. |
| [get_AbsoluteUri](./get_absoluteuri/)() const | يرجع الـ URI المطلق. |
| [get_Authority](./get_authority/)() const | يرجع اسم المضيف ورقم المنفذ للخادم. |
| [get_DnsSafeHost](./get_dnssafehost/)() const | يرجع اسم مضيف غير مهَرَّب. |
| [get_Fragment](./get_fragment/)() const | يرجع الجزء المُهَرَّب من الـ URI. |
| [get_Host](./get_host/)() const | يعيد اسم المضيف. |
| [get_HostNameType](./get_hostnametype/)() const | يعيد نوع اسم المضيف. |
| [get_IdnHost](./get_idnhost/)() const | يعيد اسم نطاق دولي للمضيف. |
| [get_IsAbsoluteUri](./get_isabsoluteuri/)() const | يحدد ما إذا كان الـ URI الممثَّل بواسطة الكائن الحالي مطلقًا. |
| [get_IsDefaultPort](./get_isdefaultport/)() const | يحدد ما إذا كان الـ URI الممثَّل بواسطة الكائن الحالي يحتوي على المنفذ الافتراضي لمخطط الـ URI. |
| [get_IsFile](./get_isfile/)() const | يحدد ما إذا كان الـ URI الممثَّل بواسطة الكائن الحالي ملفًا. |
| [get_IsLoopback](./get_isloopback/)() const | يحدد ما إذا كان الـ URI الممثَّل بواسطة الكائن الحالي يشير إلى مضيف محلي. |
| [get_IsUnc](./get_isunc/)() const | يحدد ما إذا كان الـ URI الممثَّل بواسطة الكائن الحالي مسار UNC. |
| [get_LocalPath](./get_localpath/)() const | يعيد تمثيل نظام التشغيل لاسم الملف المشار إليه بواسطة الـ URI الممثَّل بواسطة الكائن الحالي. |
| [get_OriginalString](./get_originalstring/)() const | يعيد سلسلة الـ URI التي تم تمريرها إلى المُنشئ عندما تم إنشاء الكائن الحالي. |
| [get_PathAndQuery](./get_pathandquery/)() const | يعيد المسار المطلق ومكوّنات الاستعلام للـ URI الممثَّل بواسطة الكائن الحالي مفصولة بعلامة استفهام (؟). |
| [get_Port](./get_port/)() const | يعيد رقم المنفذ للـ URI الممثَّل بواسطة الكائن الحالي. |
| [get_Query](./get_query/)() const | يعيد معلومات الاستعلام المتضمنة في الـ URI الممثَّل بواسطة الكائن الحالي. |
| [get_Scheme](./get_scheme/)() const | يعيد مخطط الـ URI الممثَّل بواسطة الكائن الحالي. |
| [get_Segments](./get_segments/)() const | يعيد مصفوفة من السلاسل التي تحتوي على مقاطع المسار للـ URI الممثَّل بواسطة الكائن الحالي. |
| [get_UserEscaped](./get_userescaped/)() const | يحدد ما إذا كانت سلسلة الـ URI التي تم تمريرها إلى مُنشئ الكائن الحالي مُهربة بالكامل. |
| [get_UserInfo](./get_userinfo/)() const | يعيد اسم المستخدم، كلمة المرور ومعلومات مستخدم أخرى مرتبطة بالـ URI الممثَّل بواسطة الكائن الحالي. |
| [GetComponents](./getcomponents/)(UriComponents, UriFormat) const | يعيد المكوّنات المحددة للـ URI الممثَّل بواسطة الكائن الحالي باستخدام التهريب المحدد. |
| [GetHashCode](./gethashcode/)() const override | يحصل على رمز التجزئة للـ URI. |
| [GetLeftPart](./getleftpart/)(UriPartial) | يعيد الجزء المحدد من الـ URI الممثَّل بواسطة الكائن الحالي. |
| static [HexEscape](./hexescape/)(char16_t) | يعيد ما يعادل الحرف المحدد في النظام الست عشري. |
| static [HexUnescape](./hexunescape/)(const String\&, int32_t\&) | يحوّل التمثيل الست عشري المحدد لحرف إلى حرف. |
| [IsBaseOf](./isbaseof/)(const SharedPtr\<Uri\>\&) const | يحدد ما إذا كان الـ URI الممثَّل بواسطة الكائن الحالي [Uri](./) هو قاعدة للـ URI الممثَّل بواسطة الكائن [Uri](./) المحدد. |
| static [IsHexDigit](./ishexdigit/)(char16_t) | يحدد ما إذا كان الحرف المحدد يمثل رقمًا سداسيًا عشريًا صالحًا. |
| static [IsHexEncoding](./ishexencoding/)(const String\&, int32_t) | يحدد ما إذا كان حرف في السلسلة المحددة في الموضع المحدد مُشفَّرًا سداسيًا عشريًا. |
| [IsWellFormedOriginalString](./iswellformedoriginalstring/)() const | يشير إلى ما إذا كانت السلسلة المستخدمة لإنشاء هذا [Uri](./) مُشكّلة بشكل صحيح ولا تحتاج إلى مزيد من الهروب. |
| static [IsWellFormedUriString](./iswellformeduristring/)(const String\&, UriKind) | يحدد ما إذا كانت السلسلة المحددة URI مُشكّلة بشكل صحيح. |
| [MakeRelative](./makerelative/)(const SharedPtr\<Uri\>\&) | يحدد الفرق بين مثالي [Uri](./) اثنين. |
| [MakeRelativeUri](./makerelativeuri/)(const SharedPtr\<Uri\>\&) | يحدد الفرق بين عناوين URI التي تمثلها الكائنات الحالية والمحددة من نوع [Uri](./). |
| [ToString](./tostring/)() const override | يعيد تمثيل السلسلة للـ URI الذي يمثله الكائن الحالي. |
| static [TryCreate](./trycreate/)(const String\&, UriKind, SharedPtr\<Uri\>\&) | ينشئ كائنًا من نوع [Uri](./) يمثل الـ URI المحدد؛ يحدد معامل نوع الـ URI. |
| static [TryCreate](./trycreate/)(const SharedPtr\<Uri\>\&, const String\&, SharedPtr\<Uri\>\&) | ينشئ كائنًا من نوع [Uri](./) من كائن [Uri](./) المحدد الذي يمثل الـ URI الأساسي وتمثيل السلسلة للـ URI النسبي. |
| static [TryCreate](./trycreate/)(const SharedPtr\<Uri\>\&, const SharedPtr\<Uri\>\&, SharedPtr\<Uri\>\&) | ينشئ كائنًا من نوع [Uri](./) من الـ URI الأساسي والـ URI النسبي المحددين. |
| static [UnescapeDataString](./unescapedatastring/)(const String\&) | يلغي هروب السلسلة المشفرة المحددة. |
| [Uri](./uri/)(const String\&) | ينشئ كائنًا من نوع [Uri](./) يمثل الـ URI المحدد. |
| [Uri](./uri/)(const String\&, bool) | ينشئ كائنًا من نوع [Uri](./) يمثل الـ URI المحدد؛ يحدد معامل ما إذا كان يجب هروب الـ URI. |
| [Uri](./uri/)(const SharedPtr\<Uri\>\&, const String\&, bool) | ينشئ كائنًا من نوع [Uri](./) من كائن [Uri](./) المحدد الذي يمثل الـ URI الأساسي وتمثيل السلسلة للـ URI النسبي؛ يحدد معامل ما إذا كان يجب هروب الـ URI. |
| [Uri](./uri/)(const String\&, UriKind) | ينشئ كائنًا من نوع [Uri](./) يمثل الـ URI المحدد؛ يحدد معامل نوع الـ URI. |
| [Uri](./uri/)(const SharedPtr\<Uri\>\&, const String\&) | ينشئ كائنًا من نوع [Uri](./) من الـ URI الأساسي والـ URI النسبي المحددين. |
| [Uri](./uri/)(const SharedPtr\<Uri\>\&, const SharedPtr\<Uri\>\&) | ينشئ كائنًا من نوع [Uri](./) من الـ URI الأساسي والـ URI النسبي المحددين. |
## الحقول

| حقل | الوصف |
| --- | --- |
| static [SchemeDelimiter](./schemedelimiter/) | يحدد الأحرف التي تفصل مخطط بروتوكول الاتصال عن جزء العنوان في الـ [Uri](./). |
| static [UriSchemeFile](./urischemefile/) | يحدد أن الـ [Uri](./) هو مؤشر إلى ملف. |
| static [UriSchemeFtp](./urischemeftp/) | يحدد أن الـ [Uri](./) يُستَخدم عبر بروتوكول نقل الملفات. |
| static [UriSchemeGopher](./urischemegopher/) | يحدد أن الـ [Uri](./) يُستَخدم عبر بروتوكول Gopher. |
| static [UriSchemeHttp](./urischemehttp/) | يحدد أن الـ [Uri](./) يُستَخدم عبر بروتوكول نقل النص الفائق. |
| static [UriSchemeHttps](./urischemehttps/) | يحدد أن الـ [Uri](./) يُستَخدم عبر بروتوكول نقل النص الفائق الآمن. |
| static [UriSchemeMailto](./urischememailto/) | يحدد أن الـ [Uri](./) هو عنوان بريد إلكتروني ويُستَخدم عبر بروتوكول نقل البريد البسيط. |
| static [UriSchemeNetPipe](./urischemenetpipe/) | يحدد أن الـ [Uri](./) يُستَخدم عبر مخطط NetPipe المستخدم من قبل [Windows](../../system.windows/) Communication Foundation. |
| static [UriSchemeNetTcp](./urischemenettcp/) | يحدد أن الـ [Uri](./) يُستَخدم عبر مخطط NetTcp المستخدم من قبل [Windows](../../system.windows/) Communication Foundation. |
| static [UriSchemeNews](./urischemenews/) | يحدد أن الـ [Uri](./) هو مجموعة أخبار إنترنت ويُستَخدم عبر بروتوكول نقل أخبار الشبكة. |
| static [UriSchemeNntp](./urischemenntp/) | يحدد أن الـ [Uri](./) هو مجموعة أخبار إنترنت ويُستَخدم عبر بروتوكول نقل أخبار الشبكة. |
## ملاحظات



```cpp
#include "system/smart_ptr.h"
#include "system/uri.h"
#include <iostream>

int main()
{
  const auto uri = System::MakeObject<System::Uri>(u"https://docs.codeporting.com/translator/cs2cpp/release-notes/2021/codeporting-translator-cs2cpp-21-9/");

std::cout <<
  "AbsolutePath: " << uri->get_AbsolutePath() << std::endl <<
  "AbsoluteUri: " << uri->get_AbsoluteUri() << std::endl <<
  "Authority: " << uri->get_Authority() << std::endl <<
  "DnsSafeHost: " << uri->get_DnsSafeHost() << std::endl <<
  "Fragment: " << uri->get_Fragment() << std::endl <<
  "Host: " << uri->get_Host() << std::endl <<
  "IdnHost: " << uri->get_IdnHost() << std::endl <<
  "LocalPath: " << uri->get_LocalPath() << std::endl <<
  "OriginalString: " << uri->get_OriginalString() << std::endl <<
  "PathAndQuery: " << uri->get_PathAndQuery() << std::endl <<
  "Port: " << uri->get_Port() << std::endl <<
  "Query: " << uri->get_Query() << std::endl <<
  "Scheme: " << uri->get_Scheme() << std::endl;

  return 0;
}
/*
This code example produces the following output:
AbsolutePath: /translator/cs2cpp/release-notes/2021/codeporting-translator-cs2cpp-21-9/
AbsoluteUri: https://docs.codeporting.com/translator/cs2cpp/release-notes/2021/codeporting-translator-cs2cpp-21-9/
Authority: docs.codeporting.com
DnsSafeHost: docs.codeporting.com
Fragment:
Host: docs.codeporting.com
IdnHost: docs.codeporting.com
LocalPath: /translator/cs2cpp/release-notes/2021/codeporting-translator-cs2cpp-21-9/
OriginalString: https://docs.codeporting.com/translator/cs2cpp/release-notes/2021/codeporting-translator-cs2cpp-21-9/
PathAndQuery: /translator/cs2cpp/release-notes/2021/codeporting-translator-cs2cpp-21-9/
Port: 443
Query:
Scheme: https
*/
```

## انظر أيضًا

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
