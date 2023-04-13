---
title: Class XbrlInstance
second_title: .NET API 참조용 Aspose.Finance
description: Aspose.Finance.Xbrl.XbrlInstance 수업. XBRL 인스턴스는 xbrl 태그가 있는 루트 요소가 있는 XML 조각입니다. XBRL 인스턴스에는 비즈니스 보고서 팩트가 포함되며 각 팩트는Concept 지원하는 DTS에 정의되어 있습니다. XBRL 인스턴스에는 인스턴스의 팩트를 해석하는 데 필요한 추가 정보를 제공하는 컨텍스트 및 단위도 포함되어 있습니다.
type: docs
weight: 8250
url: /ko/net/aspose.finance.xbrl/xbrlinstance/
---
## XbrlInstance class

XBRL 인스턴스는 xbrl 태그가 있는 루트 요소가 있는 XML 조각입니다. XBRL 인스턴스에는 비즈니스 보고서 팩트가 포함되며 각 팩트는[`Concept`](../concept/) 지원하는 DTS에 정의되어 있습니다. XBRL 인스턴스에는 인스턴스의 팩트를 해석하는 데 필요한 추가 정보를 제공하는 컨텍스트 및 단위도 포함되어 있습니다.

```csharp
public class XbrlInstance
```

## 속성

| 이름 | 설명 |
| --- | --- |
| [ArcroleReferences](../../aspose.finance.xbrl/xbrlinstance/arcrolereferences/) { get; set; } | 컬렉션을 가져오거나 설정합니다.[`ArcroleReference`](../arcrolereference/) XBRL instance. 의 객체 |
| [Contexts](../../aspose.finance.xbrl/xbrlinstance/contexts/) { get; set; } | 컬렉션을 가져오거나 설정합니다.[`Context`](../context/) XBRL instance. 의 객체 |
| [Facts](../../aspose.finance.xbrl/xbrlinstance/facts/) { get; } | 컬렉션을 가져옵니다.[`Fact`](../fact/) XBRL instance. 의 객체 |
| [FootnoteLinks](../../aspose.finance.xbrl/xbrlinstance/footnotelinks/) { get; set; } | 컬렉션을 가져오거나 설정합니다.[`FootnoteLink`](../footnotelink/) XBRL instance. 의 객체 |
| [Items](../../aspose.finance.xbrl/xbrlinstance/items/) { get; } | 컬렉션을 가져옵니다.[`Item`](../item/) XBRL instance. 의 객체 |
| [LinkbaseRefCollection](../../aspose.finance.xbrl/xbrlinstance/linkbaserefcollection/) { get; } | 가져오기[`LinkbaseRefCollection`](./linkbaserefcollection/) 에서`XbrlInstance` . |
| [RoleReferences](../../aspose.finance.xbrl/xbrlinstance/rolereferences/) { get; set; } | 컬렉션을 가져오거나 설정합니다.[`RoleReference`](../rolereference/) XBRL instance. 의 객체 |
| [SchemaLocation](../../aspose.finance.xbrl/xbrlinstance/schemalocation/) { get; set; } | 스키마 location 를 가져오거나 설정합니다. |
| [SchemaRefs](../../aspose.finance.xbrl/xbrlinstance/schemarefs/) { get; } | SchemaRef 컬렉션을 가져옵니다. |
| [Units](../../aspose.finance.xbrl/xbrlinstance/units/) { get; set; } | 컬렉션을 가져오거나 설정합니다.[`Unit`](../unit/) XBRL instance. 의 객체 |
| [ValidationErrors](../../aspose.finance.xbrl/xbrlinstance/validationerrors/) { get; } | 유효성 검사 오류 모음을 가져옵니다. |
| [XbrlDocument](../../aspose.finance.xbrl/xbrlinstance/xbrldocument/) { get; } | 가져오기[`XbrlDocument`](./xbrldocument/) 이 instance. 를 포함하는 |

## 행동 양식

| 이름 | 설명 |
| --- | --- |
| [CreateElement](../../aspose.finance.xbrl/xbrlinstance/createelement/)(string, string, string) | 새 요소를 생성합니다. |
| [GetAllLinkbaseRefCollections](../../aspose.finance.xbrl/xbrlinstance/getalllinkbaserefcollections/)() | xbrl 인스턴스 및 스키마 참조의 모든 linkbase 참조 컬렉션을 가져옵니다. |
| [GetArcroleTypeByURI](../../aspose.finance.xbrl/xbrlinstance/getarcroletypebyuri/)(string) | 지정된 uri가 있는 ArcroleType을 가져옵니다. |
| [GetConceptById](../../aspose.finance.xbrl/xbrlinstance/getconceptbyid/)(string) | 지정된 id를 가진 개념을 가져옵니다. |
| [GetConceptByLoc](../../aspose.finance.xbrl/xbrlinstance/getconceptbyloc/)(Loc) | 로케이터로 개념을 가져옵니다. |
| [GetConceptByName](../../aspose.finance.xbrl/xbrlinstance/getconceptbyname/)(string) | 지정된 이름을 가진 개념을 가져옵니다. |
| [GetConceptByUriAndName](../../aspose.finance.xbrl/xbrlinstance/getconceptbyuriandname/)(string, string) | 지정된 URI와 이름을 가진 개념을 가져옵니다. |
| [GetContextById](../../aspose.finance.xbrl/xbrlinstance/getcontextbyid/)(string) | 지정된 ID를 가진 컨텍스트를 가져옵니다. |
| [GetPresentationLinks](../../aspose.finance.xbrl/xbrlinstance/getpresentationlinks/)(string, string) | xbrl 인스턴스의 프레젠테이션 링크를 가져옵니다. |
| [GetRoleTypeByURI](../../aspose.finance.xbrl/xbrlinstance/getroletypebyuri/)(string) | 지정된 uri가 있는 RoleType을 가져옵니다. |
| [GetUnitById](../../aspose.finance.xbrl/xbrlinstance/getunitbyid/)(string) | 지정된 id를 가진 유닛을 가져옵니다. |
| [IsValid](../../aspose.finance.xbrl/xbrlinstance/isvalid/)() | 이 XBRL 인스턴스가 유효한지 확인합니다. |
| [Validate](../../aspose.finance.xbrl/xbrlinstance/validate/)() | 이 XBRL 인스턴스를 검증합니다. |

### 또한보십시오

* 네임스페이스 [Aspose.Finance.Xbrl](../../aspose.finance.xbrl/)
* 집회 [Aspose.Finance](../../)


