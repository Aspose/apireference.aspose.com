---
title: "System::Text::RegularExpressions 네임스페이스"
linktitle: "System::Text::RegularExpressions"
second_title: "C++용 Aspose.Page"
description: "C++에서 System::Text::RegularExpressions 네임스페이스를 사용하는 방법."
type: docs
weight: 6400
url: /ko/cpp/system.text.regularexpressions/
---



## 클래스

| 클래스 | 설명 |
| --- | --- |
| [Capture](./capture/) | 단일 하위 표현식 매칭 결과입니다. 이 클래스의 객체는 반드시 [System::MakeObject()](../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../system/smartptr/) 포인터로 감싸고, 해당 포인터를 함수 인자로 전달하십시오. |
| [CaptureCollection](./capturecollection/) | 단일 캡처 그룹에 의해 수행된 캡처 목록입니다. 이 클래스의 객체는 반드시 [System::MakeObject()](../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../system/smartptr/) 포인터로 감싸고, 해당 포인터를 함수 인자로 전달하십시오. |
| [Group](./group/) | 단일 캡처 그룹에 의해 수행된 매칭 결과입니다. 이 클래스의 객체는 [System::MakeObject()](../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용해 인스턴스를 만들지 마십시오. 이렇게 하면 런타임 오류 및/또는 어설션 오류가 발생할 수 있습니다. 항상 이 클래스를 [System::SmartPtr](../system/smartptr/) 포인터로 감싸고, 해당 포인터를 함수 인자로 전달하십시오. |
| [GroupCollection](./groupcollection/) | 단일 매치에서 캡처 그룹 목록입니다. 이 클래스의 객체는 [System::MakeObject()](../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용해 인스턴스를 만들지 마십시오. 이렇게 하면 런타임 오류 및/또는 어설션 오류가 발생할 수 있습니다. 항상 이 클래스를 [System::SmartPtr](../system/smartptr/) 포인터로 감싸고, 해당 포인터를 함수 인자로 전달하십시오. |
| [GroupCollectionPtr](./groupcollectionptr/) | [Group](./group/) 컬렉션 포인터. 이 타입은 다른 객체의 삭제를 관리하는 포인터입니다. 스택에 할당하고 값이나 const 레퍼런스로 함수에 전달해야 합니다. |
| [Match](./match/) | [Single](../system/single/) 문자열에 대한 정규식 매치. 이 클래스의 객체는 [System::MakeObject()](../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용해 인스턴스를 만들지 마십시오. 이렇게 하면 런타임 오류 및/또는 어설션 오류가 발생할 수 있습니다. 항상 이 클래스를 [System::SmartPtr](../system/smartptr/) 포인터로 감싸고, 해당 포인터를 함수 인자로 전달하십시오. |
| [MatchCollection](./matchcollection/) | 문자열에 정규식을 반복 적용하여 얻은 매치 컬렉션입니다. 이 클래스의 객체는 [System::MakeObject()](../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용해 인스턴스를 만들지 마십시오. 이렇게 하면 런타임 오류 및/또는 어설션 오류가 발생할 수 있습니다. 항상 이 클래스를 [System::SmartPtr](../system/smartptr/) 포인터로 감싸고, 해당 포인터를 함수 인자로 전달하십시오. |
| [Regex](./regex/) | C#와 유사한 구문을 따르는 정규식입니다. 이 클래스의 객체는 [System::MakeObject()](../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용해 인스턴스를 만들지 마십시오. 이렇게 하면 런타임 오류 및/또는 어설션 오류가 발생할 수 있습니다. 항상 이 클래스를 [System::SmartPtr](../system/smartptr/) 포인터로 감싸고, 해당 포인터를 함수 인자로 전달하십시오. |
## Enums

| 열거형 | 설명 |
| --- | --- |
| [RegexOptions](./regexoptions/) | [Regex](./regex/) 옵션. |
## Typedefs

| 타입 정의 | 설명 |
| --- | --- |
| [CaptureCollectionPtr](./capturecollectionptr/) | 캡처 컬렉션에 대한 포인터. |
| [CapturePtr](./captureptr/) | 단일 캡처 객체에 대한 포인터. |
| [GroupPtr](./groupptr/) | 그룹에 대한 포인터. |
| [MatchCollectionPtr](./matchcollectionptr/) | [Match](./match/) 컬렉션 포인터. |
| [MatchEvaluator](./matchevaluator/) | 매치를 평가하는 대리자 타입. |
| [MatchPtr](./matchptr/) | [Match](./match/) 포인터. |
| [RegexPtr](./regexptr/) | [Regex](./regex/) 포인터. |
| [UStringPtr](./ustringptr/) | 복사를 방지하기 위한 공유 UnicodeString. |
