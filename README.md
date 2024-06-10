# LoginApp - Aplicação de Login em Kotlin

## Descrição

LoginApp é uma aplicação Android desenvolvida em Kotlin que permite aos usuários se autenticarem em um sistema. O aplicativo apresenta uma interface simples para o login, incluindo a verificação de credenciais de usuário.

## Especificações

### Requisitos para rodar o app

- **Versão do Gradle:** 6.5 ou superior
- **Versão do Kotlin:** 1.4.10 ou superior
- **Versão do SDK do Android:** 7.0 (Nougat) ou superior

### Estrutura do Projeto



### Detalhamento dos Arquivos e Pastas

- **MainActivity.kt:** Contém a lógica principal para a interface do usuário.
- **LoginViewModel.kt:** Implementa a lógica de negócios e interação com o repositório.
- **LoginRepository.kt:** Gerencia a comunicação com a fonte de dados (API, banco de dados, etc.).
- **User.kt:** Modelo de dados que representa um usuário.
- **activity_main.xml:** Layout XML para a interface de login.
- **strings.xml:** Arquivo de recursos de strings para o aplicativo.


## Instruções de Configuração

1. **Clone o repositório:**
   ```sh
   git clone https://github.com/Ww1ll/FATEC-Login_App.git
   cd LoginApp
   ```

2. **Abra o projeto no Android Studio:**
    - Inicie o Android Studio.
    - Selecione "Open an existing Android Studio project".
    - Navegue até o diretório clonado e selecione a pasta `LoginApp`.

3. **Instale as dependências:**
    - O Android Studio solicitará que você sincronize o projeto com o Gradle. Clique em "Sync Now".

4. **Execute o aplicativo:**
    - Conecte um dispositivo Android ou inicie um emulador.
    - Clique no botão "Run" (ícone de play) no Android Studio.

## Dependências

Certifique-se de que as seguintes dependências estão incluídas no arquivo `build.gradle` do módulo `app`:

```groovy
dependencies {
    implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.appcompat:appcompat:1.7.0")
    implementation("com.google.android.material:material:1.12.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}
```

## Contribuição

1. Faça um fork do projeto.
2. Crie uma branch para a sua feature (`git checkout -b feature/nova-feature`).
3. Commit suas mudanças (`git commit -am 'Adiciona nova feature'`).
4. Faça um push para a branch (`git push origin feature/nova-feature`).
5. Abra um Pull Request.

## Licença

Este projeto está licenciado sob os termos da licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.

---

**Desenvolvido por William Braz**