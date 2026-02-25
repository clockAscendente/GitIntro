
# Git Introducción 

---

## ¿Qué es Git?

Git es un sistema de **control de versiones distribuido**, rápido y escalable.

En términos simples: Git gestiona los cambios realizados en una base de código a lo largo del desarrollo de un proyecto.

---

## Herramientas, Servicios y Clientes

Git se distribuye como un programa de **interfaz de línea de comandos (CLI)**. Este documento cubre los comandos y conceptos principales de CLI.

### Clientes GUI

Los clientes GUI proporcionan una vista gráfica amigable de lo que Git está haciendo en segundo plano. Usan las mismas acciones subyacentes de Git pero pueden no exponer todo el poder de la CLI. Para la mayoría de los flujos de trabajo, esto no es una limitación.

- [Lista incompleta de clientes GUI basados en Windows para Git](https://git-scm.com/downloads/guis)

### Servicios de Hosting y Repositorios Remotos

Git es un sistema de control de versiones **distribuido** — puede rastrear archivos a través de repositorios relacionados pero remotos. El historial de cambios se almacena localmente en una carpeta oculta `.git`. Esta carpeta no debe editarse manualmente; los comandos de Git la gestionan.

Los servicios de hosting populares (GitHub, GitLab, Bitbucket, etc.) proporcionan almacenamiento en línea para repositorios remotos y funciones de conveniencia. El control de versiones en sí es manejado por Git localmente; el servicio solo almacena y sincroniza una copia remota.

---
