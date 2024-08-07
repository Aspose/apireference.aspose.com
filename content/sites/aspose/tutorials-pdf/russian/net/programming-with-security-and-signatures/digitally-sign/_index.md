---
title: Цифровой вход в файл PDF
linktitle: Цифровой вход в файл PDF
second_title: Aspose.PDF для справочника API .NET
description: Узнайте, как выполнить цифровую подпись в файле PDF с помощью Aspose.PDF для .NET.
type: docs
weight: 40
url: /ru/net/programming-with-security-and-signatures/digitally-sign/
---
В этом руководстве мы познакомим вас с процессом цифровой подписи в PDF-файле с помощью Aspose.PDF для .NET. Цифровая подпись гарантирует подлинность и целостность документа, добавляя уникальный электронный отпечаток пальца.

## Шаг 1: Предпосылки

Прежде чем начать, убедитесь, что у вас есть следующие предварительные условия:

- Базовые знания языка программирования С#
- Установка Visual Studio на ваш компьютер
- Установлена библиотека Aspose.PDF для .NET

## Шаг 2: Настройка среды

Чтобы приступить к работе, выполните следующие действия, чтобы настроить среду разработки:

1. Откройте Visual Studio и создайте новый проект C#.
2. Импортируйте необходимые пространства имен в файл кода:

```csharp
using Aspose.Pdf;
using Aspose.Pdf.Forms;
using System.Collections.Generic;
```

## Шаг 3: Цифровая подпись

Первым шагом является цифровая подпись файла PDF. В предоставленном коде показано, как создать цифровую подпись с помощью Aspose.PDF для .NET.

```csharp
string dataDir = "YOUR DOCUMENTS DIRECTORY";
string pbxFile = "";
string inFile = dataDir + @"DigitallySign.pdf";
string outFile = dataDir + @"DigitallySign_out.pdf";
using (Document document = new Document(inFile))
{
     using (PdfFileSignature signature = new PdfFileSignature(document))
     {
         PKCS7 pkcs = new PKCS7(pbxFile, "WebSales");
         DocMDPSignature docMdpSignature = new DocMDPSignature(pkcs, DocMDPAccessPermissions.FillingInForms);
         System.Drawing.Rectangle rect = new System.Drawing.Rectangle(100, 100, 200, 100);
         signature.SignatureAppearance = dataDir + @"aspose-logo.jpg";
         signature.Certify(1, "Reason for signing", "Contact", "Location", true, rect, docMdpSignature);
         signature.Save(outFile);
     }
}
```

Этот код загружает файл PDF, создает цифровую подпись с указанным внешним видом, а затем сохраняет файл PDF с добавленной подписью.

## Шаг 4: Проверка подписи

После добавления цифровой подписи вы можете проверить, содержит ли файл PDF действительную подпись.

```csharp
using(Document document = new Document(outFile))
{
     using (PdfFileSignature signature = new PdfFileSignature(document))
     {
         IList<string> sigNames = signature. GetSignNames();
         if (sigNames.Count > 0)
         {
             if (signature.VerifySigned(sigNames[0] as string))
             {
                 if (signature.IsCertified)
                 {
                     if (signature.GetAccessPermissions() == DocMDPAccessPermissions.FillingInForms)
                     {
                         // Сделай что-нибудь
                     }
                 }
             }
         }
     }
}
```

Этот код проверяет первую подпись файла PDF и выполняет дополнительные действия, если подпись сертифицирована и имеет определенные разрешения.

### Пример исходного кода для цифровой подписи с использованием Aspose.PDF для .NET 
```csharp
try
{
	// Путь к каталогу документов.
	string dataDir = "YOUR DOCUMENTS DIRECTORY";
	string pbxFile = "";
	string inFile = dataDir + @"DigitallySign.pdf";
	string outFile = dataDir + @"DigitallySign_out.pdf";
	using (Document document = new Document(inFile))
	{
		using (PdfFileSignature signature = new PdfFileSignature(document))
		{
			PKCS7 pkcs = new PKCS7(pbxFile, "WebSales"); // Используйте объекты PKCS7/PKCS7Detached
			DocMDPSignature docMdpSignature = new DocMDPSignature(pkcs, DocMDPAccessPermissions.FillingInForms);
			System.Drawing.Rectangle rect = new System.Drawing.Rectangle(100, 100, 200, 100);
			// Установить внешний вид подписи
			signature.SignatureAppearance = dataDir + @"aspose-logo.jpg";
			// Создайте любой из трех типов подписи
			signature.Certify(1, "Signature Reason", "Contact", "Location", true, rect, docMdpSignature);
			// Сохранить выходной PDF-файл
			signature.Save(outFile);
		}
	}
	using (Document document = new Document(outFile))
	{
		using (PdfFileSignature signature = new PdfFileSignature(document))
		{
			IList<string> sigNames = signature.GetSignNames();
			if (sigNames.Count > 0) // Есть подписи?
			{
				if (signature.VerifySigned(sigNames[0] as string)) // Подтвердить первый
				{
					if (signature.IsCertified) // Проверенный?
					{
						if (signature.GetAccessPermissions() == DocMDPAccessPermissions.FillingInForms) // Получить разрешение на доступ
						{
							// Сделай что-нибудь
						}
					}
				}
			}
		}
	}
}
catch (Exception ex)
{
	Console.WriteLine(ex.Message);
}
```

## Заключение

Поздравляем! Вы успешно выполнили цифровую подпись в файле PDF, используя Aspose.PDF для .NET. В этом руководстве описан пошаговый процесс, от добавления цифровой подписи до проверки ее достоверности. Теперь вы можете использовать эту функцию для защиты файлов PDF с помощью цифровых подписей.

### Часто задаваемые вопросы

#### В: Какова цель этого урока?

О. В этом учебном пособии описан процесс цифровой подписи PDF-файла с помощью Aspose.PDF для .NET. Цифровые подписи добавляют электронный отпечаток пальца для обеспечения подлинности и целостности документа.

#### В: Какие предварительные условия необходимы перед запуском?

О: Прежде чем начать, убедитесь, что у вас есть базовые знания языка программирования C#, установлена Visual Studio и установлена библиотека Aspose.PDF для .NET.

#### Q: Как настроить среду разработки?

О. Следуйте предоставленным инструкциям, чтобы настроить среду разработки, включая создание нового проекта C# в Visual Studio и импорт необходимых пространств имен.

#### В: Как добавить цифровую подпись в файл PDF?

 О. В предоставленном примере кода показано, как загрузить PDF-файл, создать цифровую подпись, указать внешний вид и сохранить подписанный PDF-файл. Цифровая подпись добавляется с помощью`Certify` метод`PdfFileSignature` объект.

#### Вопрос: Как проверить действительность цифровой подписи?

О: После добавления цифровой подписи вы можете использовать пример кода для проверки действительности подписи. Он проверяет, сертифицирована ли подпись и имеет ли она определенные права доступа.

####  В: Что означает`PKCS7` object represent?

 А:`PKCS7` Объект используется для обеспечения криптографической функциональности цифровых подписей. Он используется для создания цифровой подписи в предоставленном образце кода.

#### В: Можно ли настроить внешний вид цифровой подписи?

 О: Да, вы можете настроить внешний вид цифровой подписи, указав путь к изображению в`SignatureAppearance` собственность`PdfFileSignature` объект.

#### В: Что произойдет, если подпись недействительна?

О: Если подпись недействительна, процесс проверки завершится неудачно, и соответствующие действия в блоке кода проверки не будут выполнены.

#### В: Как я могу обеспечить безопасность своих цифровых подписей?

О: Цифровые подписи защищены по своей конструкции и используют криптографические методы для обеспечения подлинности и целостности. Обеспечьте безопасность своего закрытого ключа и следуйте рекомендациям по работе с цифровыми подписями.

#### В: Могу ли я добавить несколько цифровых подписей в файл PDF?

 О: Да, вы можете добавить несколько цифровых подписей в файл PDF, используя`PdfFileSignature` объекты`Sign` или`Certify` методы. Каждая подпись будет иметь свой внешний вид и конфигурацию.