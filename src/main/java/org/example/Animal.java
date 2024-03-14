package org.example;


import org.apache.commons.lang3.StringUtils;

public class Animal {

        private int id;
        private String nome;
        private String raca;
        private String porte;
        private String pelagem;
        private double peso;



        public Animal(int id, String nome, String raca, String porte, String pelagem, double peso) {
            this.id = id;
            this.nome = nome;
            this.raca = raca;
            this.porte = porte;
            this.pelagem = pelagem;
            this.peso = peso;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getRaca() {
            return raca;
        }

        public void setRaca(String raca) {
            this.raca = raca;
        }

        public String getPorte() {
            return porte;
        }

        public void setPorte(String porte) {
            this.porte = porte;
        }

        public String getPelagem() {
            return pelagem;
        }

        public void setPelagem(String pelagem) {
            this.pelagem = pelagem;
        }

        public double getPeso() {
            return peso;
        }

        public void setPeso(double peso) {
            this.peso = peso;
        }

        public boolean isValid() {
            return StringUtils.isAllEmpty(nome, raca, porte, pelagem) &&
                    peso != 0 && id != 0;

    }


    }

