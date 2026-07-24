---
title: "Aspose::Page::License::SetLicense method"
linktitle: "SetLicense"
second_title: "C++용 Aspose.Page"
description: "Aspose::Page::License::SetLicense 메서드. C++에서 구성 요소에 라이선스를 적용합니다."
type: docs
weight: 400
url: /ko/cpp/aspose.page/license/setlicense/
---
## License::SetLicense(System::SharedPtr\<System::IO::Stream\>) method


구성 요소에 라이선스를 적용합니다.

```cpp
void Aspose::Page::License::SetLicense(System::SharedPtr<System::IO::Stream> stream)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 스트림 | System::SharedPtr\<System::IO::Stream\> | 라이선스를 포함하는 스트림입니다. |
## 비고



스트림에서 라이선스를 로드하려면 이 메서드를 사용하십시오.

<javaName>void setLicense(java.io.InputStream stream)</javaName>
## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [License](../)
* Namespace [Aspose::Page](../../)
* Library [Aspose.Page for C++](../../../)
## License::SetLicense(System::String) method


구성 요소에 라이선스를 적용합니다.

```cpp
void Aspose::Page::License::SetLicense(System::String licenseName)
```

## 비고


다음 위치에서 라이선스를 찾으려고 시도합니다:

1. 명시적 경로.

<ms>

2. 구성 요소 어셈블리의 폴더.

3. 클라이언트 호출 어셈블리의 폴더.

4. 엔트리 어셈블리의 폴더.

5. 클라이언트 호출 어셈블리의 임베드된 리소스.

**Note:**On the .NET Compact Framework, tries to find the license only in these locations:

1. 명시적 경로.

2. 클라이언트 호출 어셈블리의 임베드된 리소스.

</ms>

<java>

2. 구성 요소 JAR 파일의 폴더.

</java>
## 또 보기

* Class [String](../../../system/string/)
* Class [License](../)
* Namespace [Aspose::Page](../../)
* Library [Aspose.Page for C++](../../../)
