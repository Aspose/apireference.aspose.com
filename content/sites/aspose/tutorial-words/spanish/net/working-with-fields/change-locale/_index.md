---
title: Cambiar configuración regional
linktitle: Cambiar configuración regional
second_title: Referencia de API de Aspose.Words para .NET
description: Aprenda a cambiar la configuración regional para el formato de fecha y número en documentos de Word usando Aspose.Words para .NET.
type: docs
weight: 10
url: /es/net/working-with-fields/change-locale/
---

En este tutorial, lo guiaremos a través del proceso de cambio de configuración regional en documentos de Word usando Aspose.Words para .NET. Al modificar la configuración regional, puede controlar el formato de fechas y números durante las operaciones de combinación de correspondencia. Le proporcionaremos el código fuente de C# necesario y las instrucciones paso a paso para lograrlo.

## requisitos previos
Antes de comenzar, asegúrese de tener los siguientes requisitos previos:
- Aspose.Words para la biblioteca .NET instalada en su sistema.

## Paso 1: Cree un documento y DocumentBuilder
Para comenzar, cree una instancia de la clase Document y un objeto DocumentBuilder:

```csharp
string dataDir = "YOUR DOCUMENT DIRECTORY";
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);
```

## Paso 2: Insertar un campo
A continuación, inserte un campo de combinación en el documento utilizando el método InsertField:

```csharp
builder.InsertField("MERGEFIELD Date");
```

En el código anterior, insertamos un campo de combinación llamado "Fecha" en el documento.

## Paso 3: cambiar la configuración regional
Para cambiar la configuración regional del formato de fecha y número, puede modificar la referencia cultural actual del hilo. En este ejemplo, estableceremos la configuración regional en alemán ("de-DE"):

```csharp
CultureInfo currentCulture = Thread.CurrentThread.CurrentCulture;
Thread.CurrentThread.CurrentCulture = new CultureInfo("de-DE");
```

En el código anterior, almacenamos la cultura actual y luego establecemos la cultura del subproceso actual en alemán.

## Paso 4: realizar la combinación de correspondencia
Realice una operación de combinación de correspondencia y proporcione el valor de fecha para el campo "Fecha":

```csharp
doc.MailMerge.Execute(new[] { "Date" }, new object[] { DateTime.Now });
```

En este fragmento de código, ejecutamos la operación de combinación de correspondencia y proporcionamos la fecha actual como valor para el campo "Fecha".

## Paso 5: restaurar la configuración regional original
Una vez completada la combinación de correspondencia, restaure la referencia cultural original para el hilo:

```csharp
Thread.CurrentThread.CurrentCulture = currentCulture;
```

En el código anterior, restauramos la cultura original del hilo.

## Paso 6: Guarde el documento
Guarde el documento modificado en un archivo utilizando el método Guardar de la clase Documento:

```csharp
doc.Save(dataDir + "WorkingWithFields.ChangeLocale.docx");
```

### Ejemplo de código fuente para cambiar la configuración regional usando Aspose.Words para .NET
Aquí está el código fuente completo para cambiar la configuración regional en documentos de Word usando Aspose.Words para .NET:

```csharp
string dataDir = "YOUR DOCUMENT DIRECTORY";
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

builder.InsertField("MERGEFIELD Date");

CultureInfo currentCulture = Thread.CurrentThread.CurrentCulture;
Thread.CurrentThread.CurrentCulture = new CultureInfo("de-DE");

doc.MailMerge.Execute(new[] { "Date" }, new object[] { DateTime.Now });

Thread.CurrentThread.CurrentCulture = currentCulture;

doc.Save(dataDir + "WorkingWithFields.ChangeLocale.docx");
```

## Conclusión
¡Felicidades! Ha aprendido con éxito cómo cambiar la configuración regional en documentos de Word utilizando Aspose.Words para .NET. Siguiendo la guía paso a paso y utilizando el código fuente provisto, ahora puede controlar el formato de fechas y números durante las operaciones de combinación de correspondencia. Personalice la configuración regional de acuerdo con sus requisitos para garantizar un formato preciso y uniforme en sus documentos.
