---
title: "System::Xml::Xsl::XsltSettings class"
linktitle: "XsltSettings"
second_title: "C++용 Aspose.Page"
description: "System::Xml::Xsl::XsltSettings 클래스. C++에서 XSLT 스타일 시트를 실행하는 동안 지원할 XSLT 기능을 지정합니다."
type: docs
weight: 800
url: /ko/cpp/system.xml.xsl/xsltsettings/
---
## XsltSettings class


XSLT 스타일 시트를 실행하는 동안 지원할 XSLT 기능을 지정합니다.

```cpp
class XsltSettings : public System::Object
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| static [get_Default](./get_default/)() | 기본 설정을 가진 [XsltSettings](./) 객체를 반환합니다. XSLT **document()** 함수와 임베드된 스크립트 블록에 대한 지원이 비활성화됩니다. |
| [get_EnableDocumentFunction](./get_enabledocumentfunction/)() | XSLT **document()** 함수에 대한 지원을 활성화할지 여부를 나타내는 값을 반환합니다. |
| [get_EnableScript](./get_enablescript/)() | 임베드된 스크립트 블록에 대한 지원을 활성화할지 여부를 나타내는 값을 반환합니다. |
| static [get_TrustedXslt](./get_trustedxslt/)() | XSLT **document()** 함수와 임베드된 스크립트 블록에 대한 지원을 활성화하는 [XsltSettings](./) 객체를 반환합니다. |
| [set_EnableDocumentFunction](./set_enabledocumentfunction/)(bool) | XSLT **document()** 함수에 대한 지원을 활성화할지 여부를 나타내는 값을 설정합니다. |
| [set_EnableScript](./set_enablescript/)(bool) | 임베드된 스크립트 블록에 대한 지원을 활성화할지 여부를 나타내는 값을 설정합니다. |
| [XsltSettings](./xsltsettings/)() | 기본 설정으로 [XsltSettings](./) 클래스의 새 인스턴스를 초기화합니다. |
| [XsltSettings](./xsltsettings/)(bool, bool) | 지정된 설정으로 [XsltSettings](./) 클래스의 새 인스턴스를 초기화합니다. |
## Typedefs

| 타입 정의 | 설명 |
| --- | --- |
| [Ptr](./ptr/) | 이 클래스 인스턴스에 대한 공유 포인터 별칭입니다. |
## 비고



이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용해서 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 인수로 함수에 전달하십시오.

## 또 보기

* Class [Object](../../system/object/)
* Namespace [System::Xml::Xsl](../)
* Library [Aspose.Page for C++](../../)
