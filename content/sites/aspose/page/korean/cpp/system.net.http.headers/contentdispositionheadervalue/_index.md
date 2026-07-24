---
title: "System::Net::Http::Headers::ContentDispositionHeaderValue 클래스"
linktitle: "ContentDispositionHeaderValue"
second_title: "C++용 Aspose.Page"
description: "System::Net::Http::Headers::ContentDispositionHeaderValue 클래스. ''Content-Disposition'' 헤더의 값을 나타냅니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 C++에서 함수 인수로 전달하십시오."
type: docs
weight: 300
url: /ko/cpp/system.net.http.headers/contentdispositionheadervalue/
---
## ContentDispositionHeaderValue class


''Content-Disposition'' 헤더의 값을 나타냅니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 함수 인수로 전달하십시오.

```cpp
class ContentDispositionHeaderValue : public System::ICloneable
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [ContentDispositionHeaderValue](./contentdispositionheadervalue/)() | 새 인스턴스를 생성합니다. |
| [ContentDispositionHeaderValue](./contentdispositionheadervalue/)(String) | 새 인스턴스를 생성합니다. |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | C# [Object.Equals](../../system/object/equals/) 의미에 따라 객체를 비교합니다. |
| [get_CreationDate](./get_creationdate/)() | 파일 생성 날짜를 가져옵니다. |
| [get_DispositionType](./get_dispositiontype/)() | RTTI 정보. |
| [get_FileName](./get_filename/)() | 메시지 페이로드를 저장하기 위한 파일 이름을 구성하는 방법을 결정하는 값을 가져옵니다. 엔터티가 분리되어 별도의 파일에 저장될 때 사용됩니다. |
| [get_FileNameStar](./get_filenamestar/)() | 메시지 페이로드를 저장하기 위한 파일 이름들을 구성하는 방법을 결정하는 값을 가져옵니다. 엔터티들이 분리되어 별도의 파일에 저장될 때 사용됩니다. |
| [get_ModificationDate](./get_modificationdate/)() | 파일 수정 날짜를 가져옵니다. |
| [get_Name](./get_name/)() | 콘텐츠 본문의 일부에 대한 이름을 가져옵니다. |
| [get_Parameters](./get_parameters/)() | 'Content-Disposition' 헤더의 매개변수 컬렉션을 반환합니다. |
| [get_ReadDate](./get_readdate/)() | 파일이 마지막으로 읽힌 날짜를 가져옵니다. |
| [get_Size](./get_size/)() | 대략적인 파일 크기를 가져옵니다. |
| static [GetDispositionTypeLength](./getdispositiontypelength/)(String, int32_t, System::SharedPtr\<Object\>\&) | 지정된 인덱스부터 전달된 문자열을 [ContentDispositionHeaderValue](./) 클래스의 인스턴스로 변환합니다. |
| [GetHashCode](./gethashcode/)() const override | C# [Object.GetHashCode()](../../system/object/gethashcode/) 메서드와 유사합니다. 사용자 정의 객체의 해싱을 가능하게 합니다. |
| static [Parse](./parse/)(String) | 전달된 문자열을 [ContentDispositionHeaderValue](./) 클래스의 인스턴스로 변환합니다. |
| [set_CreationDate](./set_creationdate/)(Nullable\<DateTimeOffset\>) | 파일 생성 날짜를 설정합니다. |
| [set_DispositionType](./set_dispositiontype/)(String) | 배치 유형을 설정합니다. |
| [set_FileName](./set_filename/)(String) | 메시지 페이로드를 저장하기 위한 파일 이름을 구성하는 방법을 결정하는 값을 설정합니다. 엔터티가 분리되어 별도의 파일에 저장될 때 사용됩니다. |
| [set_FileNameStar](./set_filenamestar/)(String) | 메시지 페이로드를 저장하기 위한 파일 이름들을 구성하는 방법을 결정하는 값을 설정합니다. 엔터티들이 분리되어 별도의 파일에 저장될 때 사용됩니다. |
| [set_ModificationDate](./set_modificationdate/)(Nullable\<DateTimeOffset\>) | 파일 수정 날짜를 설정합니다. |
| [set_Name](./set_name/)(String) | 콘텐츠 본문의 일부에 대한 이름을 설정합니다. |
| [set_ReadDate](./set_readdate/)(Nullable\<DateTimeOffset\>) | 파일이 마지막으로 읽힌 날짜를 설정합니다. |
| [set_Size](./set_size/)(Nullable\<int64_t\>) | 대략적인 파일 크기를 설정합니다. |
| [ToString](./tostring/)() const override | C# [Object.ToString()](../../system/object/tostring/) 메서드의 유사 구현입니다. 사용자 정의 객체를 문자열로 변환할 수 있게 합니다. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<ContentDispositionHeaderValue\>\&) | 전달된 문자열을 [ContentDispositionHeaderValue](./) 클래스의 인스턴스로 변환을 시도합니다. |
## 또 보기

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
