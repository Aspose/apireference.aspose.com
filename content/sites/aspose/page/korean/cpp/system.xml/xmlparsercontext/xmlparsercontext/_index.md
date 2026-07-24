---
title: "System::Xml::XmlParserContext::XmlParserContext 생성자"
linktitle: "XmlParserContext"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XmlParserContext::XmlParserContext 생성자. 지정된 XmlNameTable, XmlNamespaceManager, 기본 URI, xml:lang, xml:space 및 문서 유형 값을 사용하여 XmlParserContext 클래스의 새 인스턴스를 C++에서 초기화합니다."
type: docs
weight: 100
url: /ko/cpp/system.xml/xmlparsercontext/xmlparsercontext/
---
## XmlParserContext::XmlParserContext(const SharedPtr\<XmlNameTable\>\&, const SharedPtr\<XmlNamespaceManager\>\&, const String\&, const String\&, const String\&, const String\&, const String\&, const String\&, System::Xml::XmlSpace) constructor


[XmlParserContext](../) 클래스의 새 인스턴스를 지정된 [XmlNameTable](../../xmlnametable/), [XmlNamespaceManager](../../xmlnamespacemanager/), 기본 URI, **xml:lang**, **xml:space**, 및 문서 유형 값으로 초기화합니다.

```cpp
System::Xml::XmlParserContext::XmlParserContext(const SharedPtr<XmlNameTable> &nt, const SharedPtr<XmlNamespaceManager> &nsMgr, const String &docTypeName, const String &pubId, const String &sysId, const String &internalSubset, const String &baseURI, const String &xmlLang, System::Xml::XmlSpace xmlSpace)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| nt | const SharedPtr\<XmlNameTable\>\& | 문자열을 원자화하는 데 사용할 [XmlNameTable](../../xmlnametable/)입니다. 이것이 **nullptr**인 경우, **nsMgr**를 구성하는 데 사용된 이름표가 대신 사용됩니다. 원자화된 문자열에 대한 자세한 내용은 [XmlNameTable](../../xmlnametable/)을 참조하십시오. |
| nsMgr | const SharedPtr\<XmlNamespaceManager\>\& | 네임스페이스 정보를 조회하는 데 사용할 [XmlNamespaceManager](../../xmlnamespacemanager/)이며, **nullptr**일 수 있습니다. |
| docTypeName | const String\& | 문서 유형 선언의 이름입니다. |
| pubId | const String\& | 공용 식별자입니다. |
| sysId | const String\& | 시스템 식별자. |
| internalSubset | const String\& | 내부 DTD 하위 집합입니다. DTD 하위 집합은 엔터티 해석에 사용되며, 문서 검증에는 사용되지 않습니다. |
| baseURI | const String\& | XML 조각의 기본 URI입니다(조각이 로드된 위치). |
| xmlLang | const String\& | **xml:lang** 범위입니다. |
| xmlSpace | System::Xml::XmlSpace | [XmlSpace](../../xmlspace/) 값으로 **xml:space** 범위를 나타냅니다. |

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNameTable](../../xmlnametable/)
* Class [XmlNamespaceManager](../../xmlnamespacemanager/)
* Class [String](../../../system/string/)
* Enum [XmlSpace](../../xmlspace/)
* Class [XmlParserContext](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlParserContext::XmlParserContext(const SharedPtr\<XmlNameTable\>\&, const SharedPtr\<XmlNamespaceManager\>\&, const String\&, const String\&, const String\&, const String\&, const String\&, const String\&, System::Xml::XmlSpace, const SharedPtr\<System::Text::Encoding\>\&) constructor


[XmlParserContext](../) 클래스의 새 인스턴스를 지정된 [XmlNameTable](../../xmlnametable/), [XmlNamespaceManager](../../xmlnamespacemanager/), 기본 URI, **xml:lang**, **xml:space**, 인코딩 및 문서 유형 값으로 초기화합니다.

```cpp
System::Xml::XmlParserContext::XmlParserContext(const SharedPtr<XmlNameTable> &nt, const SharedPtr<XmlNamespaceManager> &nsMgr, const String &docTypeName, const String &pubId, const String &sysId, const String &internalSubset, const String &baseURI, const String &xmlLang, System::Xml::XmlSpace xmlSpace, const SharedPtr<System::Text::Encoding> &enc)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| nt | const SharedPtr\<XmlNameTable\>\& | 문자열을 원자화하는 데 사용할 [XmlNameTable](../../xmlnametable/)입니다. 이것이 **nullptr**인 경우, **nsMgr**를 구성하는 데 사용된 이름표가 대신 사용됩니다. 원자화된 문자열에 대한 자세한 내용은 [XmlNameTable](../../xmlnametable/)을 참조하십시오. |
| nsMgr | const SharedPtr\<XmlNamespaceManager\>\& | 네임스페이스 정보를 조회하는 데 사용할 [XmlNamespaceManager](../../xmlnamespacemanager/)이며, **nullptr**일 수 있습니다. |
| docTypeName | const String\& | 문서 유형 선언의 이름입니다. |
| pubId | const String\& | 공용 식별자입니다. |
| sysId | const String\& | 시스템 식별자. |
| internalSubset | const String\& | 내부 DTD 하위 집합입니다. DTD는 엔터티 해석에 사용되며, 문서 검증에는 사용되지 않습니다. |
| baseURI | const String\& | XML 조각의 기본 URI입니다(조각이 로드된 위치). |
| xmlLang | const String\& | **xml:lang** 범위입니다. |
| xmlSpace | System::Xml::XmlSpace | [XmlSpace](../../xmlspace/) 값으로 **xml:space** 범위를 나타냅니다. |
| enc | const SharedPtr\<System::Text::Encoding\>\& | 인코딩 설정을 나타내는 Encoding 객체입니다. |

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNameTable](../../xmlnametable/)
* Class [XmlNamespaceManager](../../xmlnamespacemanager/)
* Class [String](../../../system/string/)
* Enum [XmlSpace](../../xmlspace/)
* Class [Encoding](../../../system.text/encoding/)
* Class [XmlParserContext](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlParserContext::XmlParserContext(const SharedPtr\<XmlNameTable\>\&, const SharedPtr\<XmlNamespaceManager\>\&, const String\&, System::Xml::XmlSpace) constructor


[XmlParserContext](../) 클래스의 새 인스턴스를 지정된 [XmlNameTable](../../xmlnametable/), [XmlNamespaceManager](../../xmlnamespacemanager/), **xml:lang**, **xml:space** 값으로 초기화합니다.

```cpp
System::Xml::XmlParserContext::XmlParserContext(const SharedPtr<XmlNameTable> &nt, const SharedPtr<XmlNamespaceManager> &nsMgr, const String &xmlLang, System::Xml::XmlSpace xmlSpace)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| nt | const SharedPtr\<XmlNameTable\>\& | 문자열을 원자화하는 데 사용할 [XmlNameTable](../../xmlnametable/)입니다. 이것이 **nullptr**인 경우, **nsMgr**를 구성하는 데 사용된 이름표가 대신 사용됩니다. 원자화된 문자열에 대한 자세한 내용은 [XmlNameTable](../../xmlnametable/)을 참조하십시오. |
| nsMgr | const SharedPtr\<XmlNamespaceManager\>\& | 네임스페이스 정보를 조회하는 데 사용할 [XmlNamespaceManager](../../xmlnamespacemanager/)이며, **nullptr**일 수 있습니다. |
| xmlLang | const String\& | **xml:lang** 범위입니다. |
| xmlSpace | System::Xml::XmlSpace | [XmlSpace](../../xmlspace/) 값으로 **xml:space** 범위를 나타냅니다. |

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNameTable](../../xmlnametable/)
* Class [XmlNamespaceManager](../../xmlnamespacemanager/)
* Class [String](../../../system/string/)
* Enum [XmlSpace](../../xmlspace/)
* Class [XmlParserContext](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlParserContext::XmlParserContext(const SharedPtr\<XmlNameTable\>\&, const SharedPtr\<XmlNamespaceManager\>\&, const String\&, System::Xml::XmlSpace, const SharedPtr\<System::Text::Encoding\>\&) constructor


[XmlParserContext](../) 클래스의 새 인스턴스를 지정된 [XmlNameTable](../../xmlnametable/), [XmlNamespaceManager](../../xmlnamespacemanager/), **xml:lang**, **xml:space**, 인코딩 값으로 초기화합니다.

```cpp
System::Xml::XmlParserContext::XmlParserContext(const SharedPtr<XmlNameTable> &nt, const SharedPtr<XmlNamespaceManager> &nsMgr, const String &xmlLang, System::Xml::XmlSpace xmlSpace, const SharedPtr<System::Text::Encoding> &enc)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| nt | const SharedPtr\<XmlNameTable\>\& | 문자열을 원자화하는 데 사용할 [XmlNameTable](../../xmlnametable/)입니다. 이것이 **nullptr**인 경우, **nsMgr**를 구성하는 데 사용된 이름표가 대신 사용됩니다. 원자화된 문자열에 대한 자세한 내용은 [XmlNameTable](../../xmlnametable/)을 참조하십시오. |
| nsMgr | const SharedPtr\<XmlNamespaceManager\>\& | 네임스페이스 정보를 조회하는 데 사용할 [XmlNamespaceManager](../../xmlnamespacemanager/)이며, **nullptr**일 수 있습니다. |
| xmlLang | const String\& | **xml:lang** 범위입니다. |
| xmlSpace | System::Xml::XmlSpace | [XmlSpace](../../xmlspace/) 값으로 **xml:space** 범위를 나타냅니다. |
| enc | const SharedPtr\<System::Text::Encoding\>\& | 인코딩 설정을 나타내는 Encoding 객체입니다. |

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNameTable](../../xmlnametable/)
* Class [XmlNamespaceManager](../../xmlnamespacemanager/)
* Class [String](../../../system/string/)
* Enum [XmlSpace](../../xmlspace/)
* Class [Encoding](../../../system.text/encoding/)
* Class [XmlParserContext](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
