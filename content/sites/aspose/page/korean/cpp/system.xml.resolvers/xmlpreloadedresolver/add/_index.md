---
title: "System::Xml::Resolvers::XmlPreloadedResolver::Add 메서드"
linktitle: "Add"
second_title: "C++용 Aspose.Page"
description: "System::Xml::Resolvers::XmlPreloadedResolver::Add 메서드. XmlPreloadedResolver 저장소에 바이트 배열을 추가하고 이를 URI에 매핑합니다. 동일한 URI에 대한 매핑이 이미 저장소에 존재하면 기존 매핑이 C++에서 덮어쓰기됩니다."
type: docs
weight: 200
url: /ko/cpp/system.xml.resolvers/xmlpreloadedresolver/add/
---
## XmlPreloadedResolver::Add(const SharedPtr\<Uri\>\&, const ArrayPtr\<uint8_t\>\&) method


[XmlPreloadedResolver](../) 저장소에 바이트 배열을 추가하고 이를 URI에 매핑합니다. 동일한 URI에 대한 매핑이 이미 저장소에 존재하면 기존 매핑이 덮어쓰기됩니다.

```cpp
void System::Xml::Resolvers::XmlPreloadedResolver::Add(const SharedPtr<Uri> &uri, const ArrayPtr<uint8_t> &value)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| uri | const SharedPtr\<Uri\>\& | [XmlPreloadedResolver](../) 저장소에 추가되는 데이터의 URI. |
| value | const ArrayPtr\<uint8_t\>\& | 제공된 URI에 해당하는 데이터를 포함하는 바이트 배열. |

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Uri](../../../system/uri/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XmlPreloadedResolver](../)
* Namespace [System::Xml::Resolvers](../../)
* Library [Aspose.Page for C++](../../../)
## XmlPreloadedResolver::Add(const SharedPtr\<Uri\>\&, const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


[XmlPreloadedResolver](../) 저장소에 바이트 배열을 추가하고 이를 URI에 매핑합니다. 동일한 URI에 대한 매핑이 이미 저장소에 존재하면 기존 매핑이 덮어쓰기됩니다.

```cpp
void System::Xml::Resolvers::XmlPreloadedResolver::Add(const SharedPtr<Uri> &uri, const ArrayPtr<uint8_t> &value, int32_t offset, int32_t count)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| uri | const SharedPtr\<Uri\>\& | [XmlPreloadedResolver](../) 저장소에 추가되는 데이터의 URI. |
| value | const ArrayPtr\<uint8_t\>\& | 제공된 URI에 해당하는 데이터를 포함하는 바이트 배열. |
| offset | int32_t | 데이터가 시작되는 제공된 바이트 배열의 오프셋. |
| count | int32_t | 제공된 오프셋부터 바이트 배열에서 읽을 바이트 수. |

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Uri](../../../system/uri/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XmlPreloadedResolver](../)
* Namespace [System::Xml::Resolvers](../../)
* Library [Aspose.Page for C++](../../../)
## XmlPreloadedResolver::Add(const SharedPtr\<Uri\>\&, const SharedPtr\<IO::Stream\>\&) method


[XmlPreloadedResolver](../) 저장소에 Stream을 추가하고 이를 URI에 매핑합니다. 동일한 URI에 대한 매핑이 이미 저장소에 존재하면 기존 매핑이 덮어쓰기됩니다.

```cpp
void System::Xml::Resolvers::XmlPreloadedResolver::Add(const SharedPtr<Uri> &uri, const SharedPtr<IO::Stream> &value)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| uri | const SharedPtr\<Uri\>\& | [XmlPreloadedResolver](../) 저장소에 추가되는 데이터의 URI. |
| value | const SharedPtr\<IO::Stream\>\& | 제공된 URI에 해당하는 데이터를 포함하는 Stream. |

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Uri](../../../system/uri/)
* Class [Stream](../../../system.io/stream/)
* Class [XmlPreloadedResolver](../)
* Namespace [System::Xml::Resolvers](../../)
* Library [Aspose.Page for C++](../../../)
## XmlPreloadedResolver::Add(const SharedPtr\<Uri\>\&, const String\&) method


[XmlPreloadedResolver](../) 저장소에 사전 로드된 데이터를 포함하는 문자열을 추가하고 이를 URI에 매핑합니다. 동일한 URI에 대한 매핑이 이미 저장소에 존재하면 기존 매핑이 덮어쓰기됩니다.

```cpp
void System::Xml::Resolvers::XmlPreloadedResolver::Add(const SharedPtr<Uri> &uri, const String &value)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| uri | const SharedPtr\<Uri\>\& | [XmlPreloadedResolver](../) 저장소에 추가되는 데이터의 URI. |
| value | const String\& | 제공된 URI에 해당하는 데이터를 포함하는 [String](../../../system/string/) |

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [XmlPreloadedResolver](../)
* Namespace [System::Xml::Resolvers](../../)
* Library [Aspose.Page for C++](../../../)
