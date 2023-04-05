---
title: Class XmpMetadata
second_title: .NET API 참조용 Aspose.Page
description: Aspose.Page.EPS.XMP.XmpMetadata 수업. XMP 메타데이터 스트림에 대한 액세스를 제공합니다.
type: docs
weight: 190
url: /ko/net/aspose.page.eps.xmp/xmpmetadata/
---
## XmpMetadata class

XMP 메타데이터 스트림에 대한 액세스를 제공합니다.

```csharp
public sealed class XmpMetadata : IDictionary<string, XmpValue>
```

## 속성

| 이름 | 설명 |
| --- | --- |
| [Count](../../aspose.page.eps.xmp/xmpmetadata/count/) { get; } | 컬렉션의 요소 수를 가져옵니다. |
| [IsFixedSize](../../aspose.page.eps.xmp/xmpmetadata/isfixedsize/) { get; } | 컬렉션의 크기가 고정되어 있는지 확인합니다. |
| [IsReadOnly](../../aspose.page.eps.xmp/xmpmetadata/isreadonly/) { get; } | 컬렉션이 읽기 전용인지 확인합니다. |
| [IsSynchronized](../../aspose.page.eps.xmp/xmpmetadata/issynchronized/) { get; } | 컬렉션이 동기화되었는지 확인합니다. |
| [Item](../../aspose.page.eps.xmp/xmpmetadata/item/) { get; set; } | 메타데이터에서 데이터를 가져오거나 설정합니다. |
| [Keys](../../aspose.page.eps.xmp/xmpmetadata/keys/) { get; } | 메타데이터 키 모음을 가져옵니다. |
| [NamespaceManager](../../aspose.page.eps.xmp/xmpmetadata/namespacemanager/) { get; } | 네임스페이스 관리자를 가져옵니다. |
| [SyncRoot](../../aspose.page.eps.xmp/xmpmetadata/syncroot/) { get; } | 컬렉션 동기화 개체를 가져옵니다. |
| [Values](../../aspose.page.eps.xmp/xmpmetadata/values/) { get; } | 메타데이터에서 값을 가져옵니다. |

## 행동 양식

| 이름 | 설명 |
| --- | --- |
| [Add](../../aspose.page.eps.xmp/xmpmetadata/add/#add)(KeyValuePair&lt;string, XmpValue&gt;) | 사전에 키와 값 쌍을 추가합니다. |
| [Add](../../aspose.page.eps.xmp/xmpmetadata/add/#add_2)(string, object) | 메타데이터에 가치를 더합니다. |
| [Add](../../aspose.page.eps.xmp/xmpmetadata/add/#add_1)(string, XmpValue) | 메타데이터에 가치를 더합니다. |
| [AddArrayItem](../../aspose.page.eps.xmp/xmpmetadata/addarrayitem/#addarrayitem)(string, XmpValue) | 배열에 값을 추가합니다. 값은 배열 끝에 추가됩니다. |
| [AddArrayItem](../../aspose.page.eps.xmp/xmpmetadata/addarrayitem/#addarrayitem_1)(string, int, XmpValue) | 지정된 인덱스로 배열에 값을 추가합니다. |
| [AddNamedValue](../../aspose.page.eps.xmp/xmpmetadata/addnamedvalue/)(string, string, XmpValue) | 명명된 값을 구조에 추가합니다. |
| [Clear](../../aspose.page.eps.xmp/xmpmetadata/clear/)() | 메타데이터를 지웁니다. |
| [Contains](../../aspose.page.eps.xmp/xmpmetadata/contains/#contains)(KeyValuePair&lt;string, XmpValue&gt;) | 지정된 키-값 쌍이 사전에 포함되어 있는지 확인합니다. |
| [Contains](../../aspose.page.eps.xmp/xmpmetadata/contains/#contains_1)(string) | 키가 메타데이터에 포함되어 있는지 확인합니다. |
| [ContainsKey](../../aspose.page.eps.xmp/xmpmetadata/containskey/)(string) | 이 사전에 지정된 키가 포함되어 있는지 확인합니다. |
| [CopyTo](../../aspose.page.eps.xmp/xmpmetadata/copyto/)(KeyValuePair&lt;string, XmpValue&gt;[], int) | 컬렉션의 요소를 배열로 복사합니다. |
| [GetEnumerator](../../aspose.page.eps.xmp/xmpmetadata/getenumerator/)() | 사전 열거자를 반환합니다. |
| [GetNamespaceUriByPrefix](../../aspose.page.eps.xmp/xmpmetadata/getnamespaceuribyprefix/)(string) | 접두사로 네임스페이스 URI를 반환합니다. |
| [GetPrefixByNamespaceUri](../../aspose.page.eps.xmp/xmpmetadata/getprefixbynamespaceuri/)(string) | 네임스페이스 URI로 접두사를 반환합니다. |
| [RegisterNamespaceUri](../../aspose.page.eps.xmp/xmpmetadata/registernamespaceuri/#registernamespaceuri)(string, string) | 네임스페이스 URI를 등록합니다. |
| [RegisterNamespaceUri](../../aspose.page.eps.xmp/xmpmetadata/registernamespaceuri/#registernamespaceuri_1)(string, string, string) | 네임스페이스 URI를 등록합니다. |
| [Remove](../../aspose.page.eps.xmp/xmpmetadata/remove/#remove)(KeyValuePair&lt;string, XmpValue&gt;) | 컬렉션에서 키/값 쌍을 제거합니다. |
| [Remove](../../aspose.page.eps.xmp/xmpmetadata/remove/#remove_1)(string) | 메타데이터에서 항목을 제거합니다. |
| [SetArrayItem](../../aspose.page.eps.xmp/xmpmetadata/setarrayitem/)(string, int, XmpValue) | 배열에 값을 설정합니다. 이전 값은 새 값으로 대체됩니다. |
| [SetNamedValue](../../aspose.page.eps.xmp/xmpmetadata/setnamedvalue/)(string, string, XmpValue) | 명명된 값을 구조로 설정합니다. 이전에 명명된 값이 이미 있는 경우 새 값으로 대체됩니다. |
| [TryGetValue](../../aspose.page.eps.xmp/xmpmetadata/trygetvalue/)(string, out XmpValue) | 사전에서 키를 찾으려고 시도하고 발견되면 값을 검색합니다. |

### 또한보십시오

* class [XmpValue](../xmpvalue/)
* 네임스페이스 [Aspose.Page.EPS.XMP](../../aspose.page.eps.xmp/)
* 집회 [Aspose.Page](../../)


