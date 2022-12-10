package com.ipnetuniversity.tp3.entities;


import javax.persistence.*;

import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Match")
public class Match {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
    @ManyToOne
    @JoinColumn(name = "joueur1_id", updatable=false)
    private Joueur joueur1;

    @ManyToOne
    @JoinColumn(name = "joueur2_id", updatable=false)
    private Joueur joueur2;

    private Joueur vainqueur;

}

