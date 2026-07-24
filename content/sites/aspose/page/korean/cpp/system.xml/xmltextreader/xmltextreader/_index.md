---
title: "System::Xml::XmlTextReader::XmlTextReader 생성자"
linktitle: "XmlTextReader"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XmlTextReader::XmlTextReader 생성자. 지정된 스트림으로 XmlTextReader 클래스를 C++에서 새 인스턴스로 초기화합니다."
type: docs
weight: 100
url: /ko/cpp/system.xml/xmltextreader/xmltextreader/
---
## XmlTextReader::XmlTextReader(const SharedPtr\<IO::Stream\>\&) constructor


지정된 스트림으로 [XmlTextReader](../) 클래스의 새 인스턴스를 초기화합니다.

```cpp
System::Xml::XmlTextReader::XmlTextReader(const SharedPtr<IO::Stream> &input)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 입력 | const SharedPtr\<IO::Stream\>\& | 읽을 XML 데이터를 포함하는 스트림입니다. |

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlTextReader::XmlTextReader(const SharedPtr\<IO::Stream\>\&, const SharedPtr\<XmlNameTable\>\&) constructor


지정된 스트림과 [XmlNameTable](../../xmlnametable/)을 사용하여 [XmlTextReader](../) 클래스의 새 인스턴스를 초기화합니다.

```cpp
System::Xml::XmlTextReader::XmlTextReader(const SharedPtr<IO::Stream> &input, const SharedPtr<XmlNameTable> &nt)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 입력 | const SharedPtr\<IO::Stream\>\& | 읽을 XML 데이터를 포함하는 스트림입니다. |
| nt | const SharedPtr\<XmlNameTable\>\& | 사용할 [XmlNameTable](../../xmlnametable/)입니다. |

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [XmlNameTable](../../xmlnametable/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlTextReader::XmlTextReader(const SharedPtr\<IO::Stream\>\&, XmlNodeType, const SharedPtr\<XmlParserContext\>\&) constructor


지정된 스트림, [XmlNodeType](../../xmlnodetype/), 및 [XmlParserContext](../../xmlparsercontext/)을 사용하여 [XmlTextReader](../) 클래스의 새 인스턴스를 초기화합니다.

```cpp
System::Xml::XmlTextReader::XmlTextReader(const SharedPtr<IO::Stream> &xmlFragment, XmlNodeType fragType, const SharedPtr<XmlParserContext> &context)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| xmlFragment | const SharedPtr\<IO::Stream\>\& | 구문 분석할 XML 조각을 포함하는 스트림입니다. |
| fragType | XmlNodeType | XML 조각의 [XmlNodeType](../../xmlnodetype/)입니다. 이는 조각이 포함할 수 있는 내용을 결정합니다. |
| context | const SharedPtr\<XmlParserContext\>\& | [XmlParserContext](../../xmlparsercontext/)에서 **xmlFragment**를 구문 분석합니다. 여기에는 사용할 [XmlNameTable](../../xmlnametable/), 인코딩, 네임스페이스 범위, 현재 **xml:lang**, 및 **xml:space** 범위가 포함됩니다. |

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Enum [XmlNodeType](../../xmlnodetype/)
* Class [XmlParserContext](../../xmlparsercontext/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlTextReader::XmlTextReader(const SharedPtr\<IO::TextReader\>\&) constructor


지정된 TextReader로 [XmlTextReader](../) 클래스의 새 인스턴스를 초기화합니다.

```cpp
System::Xml::XmlTextReader::XmlTextReader(const SharedPtr<IO::TextReader> &input)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 입력 | const SharedPtr\<IO::TextReader\>\& | 읽을 XML 데이터를 포함하는 TextReader입니다. |

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [TextReader](../../../system.io/textreader/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlTextReader::XmlTextReader(const SharedPtr\<IO::TextReader\>\&, const SharedPtr\<XmlNameTable\>\&) constructor


지정된 TextReader와 [XmlNameTable](../../xmlnametable/)을 사용하여 [XmlTextReader](../) 클래스의 새 인스턴스를 초기화합니다.

```cpp
System::Xml::XmlTextReader::XmlTextReader(const SharedPtr<IO::TextReader> &input, const SharedPtr<XmlNameTable> &nt)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 입력 | const SharedPtr\<IO::TextReader\>\& | 읽을 XML 데이터를 포함하는 TextReader입니다. |
| nt | const SharedPtr\<XmlNameTable\>\& | 사용할 [XmlNameTable](../../xmlnametable/)입니다. |

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [TextReader](../../../system.io/textreader/)
* Class [XmlNameTable](../../xmlnametable/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlTextReader::XmlTextReader(const String\&) constructor


지정된 파일로 [XmlTextReader](../) 클래스의 새 인스턴스를 초기화합니다.

```cpp
System::Xml::XmlTextReader::XmlTextReader(const String &url)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| url | const String\& | XML 데이터를 포함하는 파일의 URL입니다. [XmlTextReader::get_BaseURI](../get_baseuri/)가 이 값으로 설정됩니다. |

## 또 보기

* Class [String](../../../system/string/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlTextReader::XmlTextReader(const String\&, const SharedPtr\<IO::Stream\>\&) constructor


지정된 URL과 스트림으로 [XmlTextReader](../) 클래스의 새 인스턴스를 초기화합니다.

```cpp
System::Xml::XmlTextReader::XmlTextReader(const String &url, const SharedPtr<IO::Stream> &input)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| url | const String\& | 외부 리소스를 해결하는 데 사용할 URL입니다. [XmlTextReader::get_BaseURI](../get_baseuri/)가 이 값으로 설정됩니다. |
| 입력 | const SharedPtr\<IO::Stream\>\& | 읽을 XML 데이터를 포함하는 스트림입니다. |

## 또 보기

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlTextReader::XmlTextReader(const String\&, const SharedPtr\<IO::Stream\>\&, const SharedPtr\<XmlNameTable\>\&) constructor


지정된 URL, 스트림 및 [XmlNameTable](../../xmlnametable/)과 함께 [XmlTextReader](../) 클래스의 새 인스턴스를 초기화합니다.

```cpp
System::Xml::XmlTextReader::XmlTextReader(const String &url, const SharedPtr<IO::Stream> &input, const SharedPtr<XmlNameTable> &nt)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| url | const String\& | 외부 리소스를 해결하는 데 사용할 URL입니다. [XmlTextReader::get_BaseURI](../get_baseuri/)가 이 값으로 설정됩니다. **url**이 **nullptr**인 경우, **BaseURI**는 [String::Empty](../../../system/string/empty/)로 설정됩니다. |
| 입력 | const SharedPtr\<IO::Stream\>\& | 읽을 XML 데이터를 포함하는 스트림입니다. |
| nt | const SharedPtr\<XmlNameTable\>\& | 사용할 [XmlNameTable](../../xmlnametable/)입니다. |

## 또 보기

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [XmlNameTable](../../xmlnametable/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlTextReader::XmlTextReader(const String\&, const SharedPtr\<IO::TextReader\>\&) constructor


지정된 URL 및 TextReader와 함께 [XmlTextReader](../) 클래스의 새 인스턴스를 초기화합니다.

```cpp
System::Xml::XmlTextReader::XmlTextReader(const String &url, const SharedPtr<IO::TextReader> &input)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| url | const String\& | 외부 리소스를 해결하는 데 사용할 URL입니다. [XmlTextReader::get_BaseURI](../get_baseuri/)가 이 값으로 설정됩니다. |
| 입력 | const SharedPtr\<IO::TextReader\>\& | 읽을 XML 데이터를 포함하는 TextReader입니다. |

## 또 보기

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [TextReader](../../../system.io/textreader/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlTextReader::XmlTextReader(const String\&, const SharedPtr\<IO::TextReader\>\&, const SharedPtr\<XmlNameTable\>\&) constructor


지정된 URL, TextReader 및 [XmlNameTable](../../xmlnametable/)과 함께 [XmlTextReader](../) 클래스의 새 인스턴스를 초기화합니다.

```cpp
System::Xml::XmlTextReader::XmlTextReader(const String &url, const SharedPtr<IO::TextReader> &input, const SharedPtr<XmlNameTable> &nt)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| url | const String\& | 외부 리소스를 해결하는 데 사용할 URL입니다. [XmlTextReader::get_BaseURI](../get_baseuri/)가 이 값으로 설정됩니다. **url**이 **nullptr**인 경우, **BaseURI**는 [String::Empty](../../../system/string/empty/)로 설정됩니다. |
| 입력 | const SharedPtr\<IO::TextReader\>\& | 읽을 XML 데이터를 포함하는 TextReader입니다. |
| nt | const SharedPtr\<XmlNameTable\>\& | 사용할 [XmlNameTable](../../xmlnametable/)입니다. |

## 또 보기

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [TextReader](../../../system.io/textreader/)
* Class [XmlNameTable](../../xmlnametable/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlTextReader::XmlTextReader(const String\&, const SharedPtr\<XmlNameTable\>\&) constructor


지정된 파일 및 [XmlNameTable](../../xmlnametable/)과 함께 [XmlTextReader](../) 클래스의 새 인스턴스를 초기화합니다.

```cpp
System::Xml::XmlTextReader::XmlTextReader(const String &url, const SharedPtr<XmlNameTable> &nt)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| url | const String\& | 읽을 XML 데이터를 포함하는 파일의 URL입니다. |
| nt | const SharedPtr\<XmlNameTable\>\& | 사용할 [XmlNameTable](../../xmlnametable/)입니다. |

## 또 보기

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNameTable](../../xmlnametable/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlTextReader::XmlTextReader(const String\&, XmlNodeType, const SharedPtr\<XmlParserContext\>\&) constructor


지정된 문자열, [XmlNodeType](../../xmlnodetype/) 및 [XmlParserContext](../../xmlparsercontext/)와 함께 [XmlTextReader](../) 클래스의 새 인스턴스를 초기화합니다.

```cpp
System::Xml::XmlTextReader::XmlTextReader(const String &xmlFragment, XmlNodeType fragType, const SharedPtr<XmlParserContext> &context)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| xmlFragment | const String\& | 구문 분석할 XML 조각을 포함하는 문자열입니다. |
| fragType | XmlNodeType | XML 조각의 [XmlNodeType](../../xmlnodetype/)입니다. 이는 조각 문자열에 포함될 수 있는 내용을 결정합니다. |
| context | const SharedPtr\<XmlParserContext\>\& | [XmlParserContext](../../xmlparsercontext/)에서 **xmlFragment**를 구문 분석합니다. 여기에는 사용할 [XmlNameTable](../../xmlnametable/), 인코딩, 네임스페이스 범위, 현재 **xml:lang**, 및 **xml:space** 범위가 포함됩니다. |

## 또 보기

* Class [String](../../../system/string/)
* Enum [XmlNodeType](../../xmlnodetype/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlParserContext](../../xmlparsercontext/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
