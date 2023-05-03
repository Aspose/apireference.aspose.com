---
title: StringFormat.SetDigitSubstitution
second_title: Aspose.Drawing for .NET API リファレンス
description: StringFormat 方法. ローカル数字が西洋数字に置き換えられるときに使用される言語と方法を指定します.
type: docs
weight: 140
url: /ja/net/system.drawing/stringformat/setdigitsubstitution/
---
## StringFormat.SetDigitSubstitution method

ローカル数字が西洋数字に置き換えられるときに使用される言語と方法を指定します.

```csharp
public void SetDigitSubstitution(int language, StringDigitSubstitute substitute)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| language | Int32 | ローカル数字が西洋数字に置き換えられるときに使用される言語を識別する National Language Support (NLS) 言語識別子. を渡すことができますLCIDa のプロパティCultureInfoobject を NLS 言語識別子として使用します。 たとえば、CultureInfoオブジェクト by 文字列を渡す`「ar-EG」`にCultureInfoconstructor. を渡すとLCIDthat のプロパティCultureInfoオブジェクトと with Traditional the へInt32,StringDigitSubstitute)method, 表示時にアラビア語インド数字が西洋数字に置き換えられます. |
| substitute | StringDigitSubstitute | の要素StringDigitSubstitute数字の表示方法を 指定する列挙。 |

### 関連項目

* enum [StringDigitSubstitute](../../stringdigitsubstitute/)
* class [StringFormat](../)
* 名前空間 [System.Drawing](../../stringformat/)
* 組み立て [Aspose.Drawing](../../../)


